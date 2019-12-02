package be.intecbrussel.webcomponents;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet {

    public static final String PARAM = "param";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        if (req.getParameter(PARAM) == null) {
            req
                    .getRequestDispatcher("WEB-INF/pages/HelloPluto.jsp")
                    .forward(req, resp);
        } else {
            req
                    .getRequestDispatcher("WEB-INF/pages/HelloParam.jsp")
                    .forward(req, resp);
        }
    }
}
