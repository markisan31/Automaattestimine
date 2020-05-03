package Server;


import school.Course;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.ZonedDateTime;

public class CourseList extends HttpServlet {



    ZonedDateTime startDate = ZonedDateTime.parse("2020-01-02T00:00:00.000+00:00[UTC]");
    ZonedDateTime endDate = ZonedDateTime.parse("2020-12-31T00:00:00.000+00:00[UTC]");

    private Course course = new Course("Robootika", 10, startDate, endDate);
    private Course course1 = new Course("AT",6, startDate.minusWeeks(6),  endDate.plusMonths(6));
    private Course course2 = new Course("Math",5, startDate.minusYears(1).minusDays(37), endDate.minusYears(1).plusDays(45));

    Course [] courses = {course, course1, course2};



    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

//        String name = request.getParameter("CourseList");

        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        for (Course a : courses){
            response.getWriter().println("<html><h1>"+a.toString()+"</h1></html>");
        }

    }
}
