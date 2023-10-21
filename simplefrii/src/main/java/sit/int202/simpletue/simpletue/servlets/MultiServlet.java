package sit.int202.simpletue.simpletue.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MultiServlet", value = "/multi_table")
public class MultiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String numberStr = request.getParameter("number");
        if(numberStr==null || numberStr.length()==0 || ! isNumber(numberStr)){
            request.setAttribute("error","Invarid number or parameter !!!");
        }
      request.getRequestDispatcher("/multi_table.jsp").forward(request,response);

    }

    private boolean isNumber(String nStr) {
        for (int i = 0; i < nStr.length();i++){
            if(!Character.isDigit(nStr.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
