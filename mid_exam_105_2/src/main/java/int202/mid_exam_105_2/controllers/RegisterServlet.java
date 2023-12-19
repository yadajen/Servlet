//natthaphol nirattisaikul 65130500105
package int202.mid_exam_105_2.controllers;

import int202.mid_exam_105_2.models.Users;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/105/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = new Users();//create new user object
        String username = request.getParameter("uName");//รับค่ามาเก็บไว้ในตัวแปร
        String email = request.getParameter("email");//รับค่ามาเก็บไว้ในตัวแปร
        HttpSession session = request.getSession();
        if (username!=null&&email!=null){//ตรวจสอบnull
            user.setName(username);//set value to user object
            user.setEmail(email);//set value to user object
            session.setAttribute("user",user);//set user to session scope เพื่อที่จได้สามารถดึงไปแสดงผลได้ทุกหน้าผ่านทาง session
        }
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
    }
}
 
