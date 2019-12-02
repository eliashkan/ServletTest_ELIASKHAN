package be.intecbrussel.webcomponents;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/postservlet")
public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        if (req.getParameter("postName").isEmpty()) {
            req.setAttribute("postName", "Guest");
        } else {
            req.setAttribute("postName", req.getParameter("postName"));
        }

        req
                .getRequestDispatcher("WEB-INF/pages/PostServlet.jsp")
                .forward(req, resp);
    }
}
