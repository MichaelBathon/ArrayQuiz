package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecDupes {

    Dupes duppie;

    int[]nums={1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};


    @Before
    public void setUp(){
        duppie = new Dupes();
    }

    @Test
    public void testEliminateDupes(){

        String expected = "1\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "4\n";

        String actual = duppie.eliminateDupes(nums);

        assertEquals("Fails if it doesn't return the sequence with just duplicates removed", expected, actual);

    }

}
