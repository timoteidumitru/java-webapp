package ro.iteahome.java.web_app.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet(name = "securedServlet", value = "/secured")
public class SecuredServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("/path/to/your/file.txt")));
        response.setContentType("text/plain");
        response.getWriter().print(content);
    }
}
