//natthaphol nirattisaikul 65130500105
package int202.mid_exam_105_2.controllers;

import int202.mid_exam_105_2.models.PrimeCheckingHistory;
import int202.mid_exam_105_2.models.PrimeNumber;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "PrimeHistoryServlet", value = "/105/history")
public class PrimeHistoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();//create session attribute
        PrimeCheckingHistory history = (PrimeCheckingHistory) session.getAttribute("history");//get history(prime checking list) from session scope
        if (history != null) {//ถ้าเคยมี history ใน session
            List<PrimeNumber> primeList = history.findAll();//ให้ไปเอา list ที่เก็บ prime number มาเก็บในตัวแปร
            int count = 0;
            for (PrimeNumber num : primeList) {//นับเฉพาะที่เป็น prime เท่านั้น
                if (num.isPrime()) {
                    count++;
                }
            }
            request.setAttribute("primeList", primeList);
            request.setAttribute("count", count);
        }
        getServletContext().getRequestDispatcher("/history.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
 
