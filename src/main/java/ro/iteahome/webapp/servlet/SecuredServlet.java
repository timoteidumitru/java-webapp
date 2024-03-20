package ro.iteahome.webapp.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import ro.iteahome.webapp.util.MenuGenerator;

@WebServlet(name = "securedServlet", value = "/secured")
public class SecuredServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Path to the secret file within the web application
        String filePath = getServletContext().getRealPath("/data/secret.txt");
        // Read the content of the file
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Generate the HTML menu
        String menuHtml = MenuGenerator.getMenuHtml();

        // Set the content type to text/html to send HTML response
        response.setContentType("text/html");

        // Prepare the HTML content
        String htmlContent = "<html><head><title>Secret File</title></head><body>" +
                menuHtml +
                "<h2>Successfully logged in, you now have access to the secret file content</h2>" +
                "<p>" + content + "</p>" + // Display the file content in a paragraph
                "</body></html>";

        // Send the HTML content
        response.getWriter().print(htmlContent);
    }
}
