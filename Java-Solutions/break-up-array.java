package breakuparray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakUpArray {

    public static void main(String[] args) {

    }

    public static List<String[]> breakUpArray(String[] arr, int size) {
        List<String[]> newArray = new ArrayList<String[]>();
        int i;
        for (i = 0; i < arr.length; i += size) {
            String[] chunk = Arrays.copyOfRange(arr, i, i + size);
            newArray.add(chunk);
        }
        return newArray;
    }

}
