//natthaphol nirattisaikul 65130500105
package int202.mid_exam_105_2.controllers;

import int202.mid_exam_105_2.models.PrimeCheckingHistory;
import int202.mid_exam_105_2.models.PrimeNumber;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PrimeCheckerServlet", value = "/105/is_prime")
public class PrimeCheckerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/isPrime.jsp").forward(request, response);//เพื่อredirectไปที่jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String num = request.getParameter("num");//get number from user input
        //create 2 attributes for store data
        String result;
        String color;
        HttpSession session = request.getSession();//create session attribute
        PrimeCheckingHistory history = (PrimeCheckingHistory) session.getAttribute("history");//get history(prime checking list) from session scope
        if (history == null) {//if history is null(ไม่มีhistoryถูกเก็บอยู่ในsession scope) จะทำการ initial empty array list ลงไป
            history = new PrimeCheckingHistory();
        }
        if (num == null || num.trim().isEmpty()) {//ถ้าuserใส่ข้อความเปล่าๆมาแล้วกดsubmit
            result = "Empty is invalid input !!!";
            color = "red";
        }
        if (num != null) {//ถ้าinputไม่เป็นnull
            //ใช้ try catch เพราะถ้าเกิดว่ามีexceptionขึ้นตอนพยายามใช้ parseInt จะได้ไม่แสดงerrorออกมา
            try {
                int number = Integer.parseInt(num);
                PrimeNumber primeNumber = new PrimeNumber(number);//สร้าง prime number ถ้า parseInt สำเร็จ
                history.getNumberList().add(primeNumber); //นำ prime number ไปเก็บไว้ใน array list
                session.setAttribute("history", history); //นำ array list เซ็ตขึ้นไปยัง session scope
                if (primeNumber.getNumber() < 2) {
                    result = num + " is invalid input !!!";
                    color = "red";
                } else if (primeNumber.isPrime()) {//*******
                    result = num + " is prime number";
                    color = "blue";
                } else {
                    result = num + " is not prime number";
                    color = "blue";
                }
//                if (number < 2) {
//                    result = num + " is invalid input !!!";
//                    color = "red";
//                } else if (isPrime(number)) {
//                    result = num + " is prime number";
//                    color = "blue";
//                } else {
//                    result = num + " is not prime number";
//                    color = "blue";
//                }
            } catch (NumberFormatException e) {//ถ้าเกิด exception จะมาใช้ result, color ตามนี้
                result = num + " is invalid input !!!";
                color = "red";
            }
            request.setAttribute("result", result);
            request.setAttribute("color", color);
        }
        getServletContext().getRequestDispatcher("/isPrime.jsp").forward(request, response);//เพื่อredirectไปที่jsp
    }

}


