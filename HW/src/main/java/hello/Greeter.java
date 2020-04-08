package hello;

public class Greeter extends Counter {
    Counter count = new Counter();

    public String sayHello(String name){


        int length = count.checkLength(name);

        if (length < 4 )
            return "Small name";

        else if (length > 10)
            return "Big name";
        else
            return String.format("Hello, %s. You name contains %d letters.", name, length);
    }


}