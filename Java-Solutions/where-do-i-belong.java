/* From FreeCodeCamp: https://www.freecodecamp.org/challenges/where-do-i-belong

"Return the lowest index at which a value (second argument) should 
be inserted into an array (first argument) once it has been sorted. 
The returned value should be a number.
*/

import java.util.Arrays;

public class WhereDoIBelong {

    public static void main(String[] args) {
    }

    public static int insertWhere(int[] arr, int num) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num) {
                return i;
            }
        }
        return arr.length;
    }
}
