package school;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
//        String name = "Tetka";
//
//        String surname = "Matematichkovna";
//
        ZonedDateTime startDate = ZonedDateTime.parse("2020-01-19T00:00:00.000+00:00[UTC]");
        ZonedDateTime endDate = ZonedDateTime.parse("2020-06-19T00:00:00.000+00:00[UTC]");

//
//        school.Teacher teacher = new school.Teacher(name, surname, datefOfBirth);
//
//        System.out.println(teacher.getAge());

//        school.PublicHolidayService service = new school.PublicHolidayService();
//        System.out.println(service.getNumberOfPublicHolidaysOnWorkingDays("2020", startDate, endDate));
        Course course = new Course(startDate, endDate);
        System.out.println(course.getWorkingDays());
        System.out.println(course.getLength());
//        System.out.println(course.getWorkingDays());



    }
}
