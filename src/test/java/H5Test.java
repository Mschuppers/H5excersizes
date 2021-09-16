import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class H5Test {

    @Test
    public void intGreatest() {
        //given
        int a = 5;
        int b = 4;

        //when
        int resultaat = H5.greatest(a,b);

        //then
        assertEquals(a,resultaat);
    }

    @Test
    public void stringGreatest() {
        //given
        String x = "Yolo";
        String y = "Jarisslavo";

        //when
        int resultaat = H5.greatest(x.length(),y.length());

        //then
        assertEquals(y.length(),resultaat);
    }

    @Test
    public void varGreatest() {
        //given


        //when
        int resultaat = H5.greatest(10,203,4032,32,300,432);


        //then
        assertEquals(4032,resultaat);
    }
}