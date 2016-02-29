package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecLastEleMinusOne {

    LastEleMinusOne eleMinusOne;
    String [] breakfast = {"Sausage","Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms", null, "Scrapple", null};

    @Before
    public void setUp(){
        eleMinusOne  = new LastEleMinusOne();
    }

    @Test
    public void testSecondToLastEle(){

        String expected = "Mushrooms";

        String actual = eleMinusOne.oneLessThanLastEle(breakfast);

        assertEquals("Fails if it doesn't give the second to last element in the array", expected, actual);

    }




}
