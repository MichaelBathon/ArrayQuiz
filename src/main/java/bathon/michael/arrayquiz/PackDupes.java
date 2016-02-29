package bathon.michael.arrayquiz;

/**
 * Created by michaelbathon on 2/10/16.
 */
public class PackDupes {

    String packTheCharDupes(char[] array) {
        String sequence = Character.toString(array[0]);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                sequence += array[i];
            } else {
                sequence += ", " + array[i + 1];
            }
        }
        return sequence;
    }

}
