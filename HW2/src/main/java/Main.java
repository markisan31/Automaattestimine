public class Main {
    public static void main(String[] args) {
        Student mark = new Student();
        mark.setAge(26);
        mark.setCourse(1);
        mark.setName("Mark");
        mark.setSurname("Kalda");

        System.out.println("Hello, I'm " + mark.name + " " + mark.surname + ". I'm " + mark.age + " years old and I'm studying on " +
                mark.course + " course.");
    }
}
