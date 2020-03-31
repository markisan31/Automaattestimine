package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class GreeterTest {

    private Greeter greeter = new Greeter();

    String name = "Mark";
    int length = 4;

    @Mock
    Counter cnt;

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(name), containsString("Hello, " + name + ". You name contains " + length + " letters"));

    }

}