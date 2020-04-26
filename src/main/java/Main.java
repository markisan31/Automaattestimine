import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Tetka";

        String surname = "Matematichkovna";


        ZonedDateTime datefOfBirth = ZonedDateTime.parse("1975-04-23T00:00:00.000+00:00[UTC]");

        Teacher teacher = new Teacher(name, surname, datefOfBirth);

        System.out.println(teacher.getAge());



    }
}
