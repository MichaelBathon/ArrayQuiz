package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class LastEleMinusOne {

    int notNullCounter = 0;

    String oneLessThanLastEle(String[] array) {
        String nextToLastEle = "";

            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] != null && notNullCounter > 0) {
                    nextToLastEle = array[i];
                    break;
                }
                if(array[i] != null){
                    notNullCounter++;
                }
            }
        return nextToLastEle;
    }
}