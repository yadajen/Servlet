package sit.int202.sitspacemanagement.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.sitspacemanagement.models.AllStudent;

import java.io.IOException;

@WebServlet(name = "RemoveServlet", value = "/Remove")
public class RemoveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        HttpSession session = request.getSession();
        AllStudent allStudent = (AllStudent) session.getAttribute("AllStudent");
        if (allStudent != null) {
            if (allStudent.findID(id)) {
                allStudent.removeStudent(id);
            }else {
                request.setAttribute("message", "There is no information for this student.");
                getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "There is no information for this student.");
            getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
        }
        session.setAttribute("findAll", allStudent.findAll());
        request.setAttribute("message", "Remove Successful");
        getServletContext().getRequestDispatcher("/AddRemoveStudent.jsp").forward(request, response);
    }
}