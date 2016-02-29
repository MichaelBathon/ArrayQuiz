package bathon.michael.arrayquiz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecPackDupes {
    PackDupes packRat;

    char[]letters={'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};

    @Before
    public void setUp(){
        packRat = new PackDupes();
    }

    @Test
    public void testCharDupesPacking(){
        String expected = "aaaa, b, cc, aa, d, eeee";

        String actual = packRat.packTheCharDupes(letters);

        assertEquals("Fails if it doesn't properly group the suplicate char's together seperated by a , and _", expected, actual);

    }





}
