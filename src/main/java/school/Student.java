package school;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends PersonImpl {

    private List<Course> courses;


    public Student(String name, String surname, ZonedDateTime dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm student!");
    }

    public List<String> showAllTeachersNames(List<Course> courses) {
        this.courses = courses;

        List<String> teachersNames = new ArrayList<String>();

        for (Course course : courses) {
            teachersNames.add(course.getTeacher().getFirstName());
        }

        return teachersNames;

    }

    public List<String> getAllTeacherNames() {
        return this.getCourses().stream()
                .map(Course::getCourseName)
                .collect(Collectors.toList());
    }

}
