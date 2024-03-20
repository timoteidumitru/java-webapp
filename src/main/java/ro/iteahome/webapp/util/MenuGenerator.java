package ro.iteahome.webapp.util;

public class MenuGenerator {
    public static String getMenuHtml() {
        return "<div style='margin: 0 auto; padding: 25px; width: 100%;'>" +
                "<a href='/webapp'>Home</a> | " +
                "<a href='/webapp/public'>Public Page</a> | " +
                "<a href='/webapp/secured?username=admin&password=password'>Secured Page</a> | " +
                "<a href='/webapp/WEB-INF/views/calendar.jsp'>View Calendar</a>" +
                "</div>";
    }
}

