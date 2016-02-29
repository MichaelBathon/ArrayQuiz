package bathon.michael.arrayquiz;

import java.util.ArrayList;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class Dupes {

    String eliminateDupes(int[] array){
        String sequence = "";
        ArrayList<Integer> dupesHolder = new ArrayList<Integer>();

        dupesHolder.add(array[0]);

        for(int i = 1; i < array.length -1; i++){
            if(array[i] != array[i-1]){
                dupesHolder.add(array[i]);
            }
        }

        for(int j = 0; j <dupesHolder.size(); j++){
            sequence += dupesHolder.get(j) + "\n";
        }

        return sequence;
    }



}
