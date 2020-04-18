public class Teacher extends PersonImpl {
    public String name;
    public String surname;
    public int age;

    @Override
    public void sayHello() {
        System.out.println("Hello, I'm teacher");
    }

    @Override
    public String getFirstName() {
        return name;
    }
}
