import java.util.List;

public class Utils {

    public static void printAllStudents(List<Student> students) {

        for (Student student : students) {
            System.out.println(student.getFullName());
        }

    }

    public List<String> getAllTeacherNames() {
        return this.getCourses().stream()
                .map(Course::getName)
                .collect(Collectors.toList());


}
