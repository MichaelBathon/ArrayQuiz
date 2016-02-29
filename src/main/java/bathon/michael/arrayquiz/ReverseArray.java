package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class ReverseArray {

    String[] reverseArrayEle(String[] array){

        for(int i = 0, j = 1; i < array.length/2; i++){
            String tempEleHolder = array[i];

            array[i] = array[array.length -j];

            array[array.length-j] = tempEleHolder;

            j++;
        }
      return array;
    }
}
