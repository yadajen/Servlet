package sit.int202.simpletue.simpletue;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "multiplication", value = "/multiplication")
public class MultiplicationServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String number = request.getParameter("number");
        if(number == null || number.length()==0||!isNumber(number)){
            request.setAttribute("message", "Invalid number or null parameter !!!");

        }
        request.getRequestDispatcher("/multiplication_table.jsp").forward(request,response);
    }

    private boolean isNumber(String numberStr) {
        for(int i=0;i<numberStr.length();i++){
            if(! Character.isDigit(numberStr.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}