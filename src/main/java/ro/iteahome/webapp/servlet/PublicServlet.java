package ro.iteahome.webapp.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import ro.iteahome.webapp.util.MenuGenerator; // Import the MenuGenerator class

@WebServlet(name = "publicServlet", value = "/public")
public class PublicServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String menuHtml = MenuGenerator.getMenuHtml();
        response.getWriter().println("<html><body style='margin: 0 auto; padding: 25px; width: 100vw;'>" + menuHtml +
                "<h2>Welcome to the Public Page</h2></body></html>");
    }
}
