package hello;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class GreeterTest {





    @Mock
    private Counter count;

    @InjectMocks
    private Greeter greeter;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void greeterSaySmallName() {
        when(count.checkLength("aaa")).thenReturn(3);


        assertEquals("Small name", greeter.sayHello("aaa"));

    }

    @Test
    public void greeterSayNormalName() {
        when(count.checkLength("aaa")).thenReturn(6);
        assertEquals("Hello, aaa. You name contains 6 letters", greeter.sayHello("aaa"));

    }

    @Test
    public void greeterSayBigName() {
        when(count.checkLength("aaa")).thenReturn(11);
        assertEquals("Big name", greeter.sayHello("aaa"));

    }



}