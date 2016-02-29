package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class ArrayQOne {

    String printArray(String[] array){
        String sequence = "";
        for(int i = 0; i < array.length; i++){
            sequence += array[i] + "\n";
        }
        return sequence.trim();
    }


}
