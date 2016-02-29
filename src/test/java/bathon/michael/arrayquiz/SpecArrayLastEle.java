package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;



/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecArrayLastEle {

    ArrayLastEle lastOne;
    String [] breakfast = {"Sausage","Eggs","Beans", "Bacon", "Tomatoes", "Mushrooms", null, "Scrapple", null};

    @Before
    public void setUp(){

        lastOne = new ArrayLastEle();
    }

    @Test
    public void testPrintLastEleMethod(){

        String expected = "Scrapple";

        String actual = lastOne.printLastArrayEle(breakfast);

        assertEquals("Fails if it doesn't print out the last element of the array", expected, actual);

    }



}
