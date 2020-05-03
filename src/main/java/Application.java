import Server.JettyServer;
import school.Course;

import java.time.ZonedDateTime;

public class Application {

    public static void main(String[] args) {

        JettyServer jettyServer = new JettyServer();

//        ZonedDateTime startDate = ZonedDateTime.parse("2020-01-02T00:00:00.000+00:00[UTC]");
//        ZonedDateTime endDate = ZonedDateTime.parse("2020-12-31T00:00:00.000+00:00[UTC]");
//
//        Course course = new Course("Robootika", startDate, endDate);
//        Course course1 = new Course("AT", startDate.minusWeeks(6), endDate.plusMonths(6));
//        Course course2 = new Course("Math", startDate.minusYears(1), endDate.minusYears(1));
//
//        Course [] courses = {course, course1, course2};

        try {
            jettyServer.start();
        } catch (Exception ex) {
            System.out.println("Something went horribly wrong");
        }

    }

}