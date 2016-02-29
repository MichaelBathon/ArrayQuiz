package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecReverseArray {

    ReverseArray backwardsArray;

    @Before
    public void setUp(){

        backwardsArray = new ReverseArray();
    }

    @Test
    public void testReverseArray(){

        String[] originalArray = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String[] expectedArray = {"Mushrooms", "Tomatoes", "Bacon", "Beans", "Eggs", "Sausage"};

        String[] actualArray = backwardsArray.reverseArrayEle(originalArray);

        assertEquals("Fails if the array elements aren't reversed", expectedArray[5], actualArray[5]);

    }

}
