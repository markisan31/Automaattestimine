
import java.time.ZonedDateTime;

public class Course {

    public String courseName;
    public Integer EAP;
    public Integer maxStudentsQuantity;
    public ZonedDateTime startDate;
    public ZonedDateTime endDate;
    public Teacher teacher;

    public String getCourseName() {
        return courseName;
    }

    public Integer getEAP() {
        return EAP;
    }

    public Integer getMaxStudentsQuantity() {
        return maxStudentsQuantity;
    }


    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
