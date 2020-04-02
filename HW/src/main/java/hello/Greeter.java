package hello;

public class Greeter extends Counter {
    public String sayHello() {
        return "Hello world!";
    }

    public String sayHello(String name){
        Counter count = new Counter();

        if (count.checkLength(name) < 4 || count.checkLength(name) > 10)
            return "Wrong name";


        return "Hello, " + name + ". You name contains " + count.checkLength(name) + " letters";
    }

    public String sayHello (String name, String surname ){
        return "You name is: " + name + " and surname is: " + surname;

    }

    public String sayHello (boolean friend){
        if (friend == true){
            return "Hello my friend!";
        }
        return "Sorry, I don't know You";
    }
}