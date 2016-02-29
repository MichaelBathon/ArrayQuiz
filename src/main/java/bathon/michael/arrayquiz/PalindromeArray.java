package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class PalindromeArray {

    boolean checkIsItAPalindrome(String[] array){
        boolean palindromeOrNot = false;
        for(int i = 0; i < array.length/2; i++){
            if(array[i].equals(array[array.length -(i +1)])){
                palindromeOrNot = true;
            }
            else{
                palindromeOrNot = false;
                return palindromeOrNot;
            }

        }
        return palindromeOrNot;
    }

}
