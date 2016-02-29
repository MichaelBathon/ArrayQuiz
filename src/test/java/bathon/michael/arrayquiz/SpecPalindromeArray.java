package bathon.michael.arrayquiz;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class SpecPalindromeArray {

    PalindromeArray pally;

    String[] array = {"bear", "lion", "tiger", "lion", "bear"};

    @Before
    public void setUp(){
        pally = new PalindromeArray();
    }

    @Test
    public void testCheckIsPalindrome(){

        boolean expected = true;

        boolean actual = pally.checkIsItAPalindrome(array);

        assertEquals("Fails if it doesn't accurately check if the array is a palindrome or not", expected, actual);

    }


}
