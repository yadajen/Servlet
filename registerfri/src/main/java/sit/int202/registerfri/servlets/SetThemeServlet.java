package sit.int202.registerfri.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.registerfri.models.CourseRegistered;
import sit.int202.registerfri.models.CourseRepository;

import java.io.IOException;
import java.util.Map;

@WebServlet(name = "SetThemeServlet", value = "/set-theme")
public class SetThemeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/set_theme.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String bgColor = request.getParameter("bgColor");
        Cookie ck = new Cookie("bg_color_cookie", bgColor);
        ck.setMaxAge(8*24*60*60);//8วัน
        response.addCookie(ck);
        response.sendRedirect("index.jsp");//บังคับให้browserส่งกลับให้เรา
    }
}

