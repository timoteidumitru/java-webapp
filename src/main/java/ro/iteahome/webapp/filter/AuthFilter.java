package ro.iteahome.webapp.filter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AuthFilter implements Filter {
    private static final Map<String, String> credentials = new HashMap<>();

    @Override
    public void init(FilterConfig filterConfig) {
        credentials.put("tim", "passw"); // Initialize with hardcoded credentials
        credentials.put("admin", "password");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String username = httpRequest.getParameter("username");
        String password = httpRequest.getParameter("password");

        if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
            chain.doFilter(request, response);
        } else {
            httpResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }
    }

    @Override
    public void destroy() {
    }
}
