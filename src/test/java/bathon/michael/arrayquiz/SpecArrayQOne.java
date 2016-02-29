package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecArrayQOne {

    ArrayQOne testArray;
    String [] breakfast = {"Sausage","Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms"};

    @Before
    public void setUp(){
        testArray = new ArrayQOne();
    }

    @Test
    public void testPrintArray(){

        String expected = "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        String actual = testArray.printArray(breakfast);

        assertEquals("Fails if the method doesn't print out the array elements on a new line", expected, actual);

    }



}
