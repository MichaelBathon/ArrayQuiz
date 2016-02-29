package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class ArrayLastEle {


    String printLastArrayEle(String[] array) {
        String lastEle = "";

        if ((array[array.length - 1]) != null) {
            lastEle = (array[array.length - 1]);
        } else {
            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] != null) {
                    lastEle = array[i];
                    break;
                }
            }
        }
        return lastEle;
    }
}
