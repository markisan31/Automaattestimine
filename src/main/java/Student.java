import java.util.ArrayList;
import java.util.List;

public class Student extends PersonImpl {

    public String name;
    public String surname;
    public int age;
    public int course;
    public List<Course> courses;

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

    @Override
    public String getFullName() {
        return String.format("Student %s %s", name, surname);
    }
}
