package largestnumbersinarrays;
public class LargestNumbersInArrays {

    public static void main(String[] args) {
    }

    public static int[] largestNumbersInArrays(int[][] arr) {
        int[] largest = new int[arr.length];
        int i = 0;
        for (int[] subArr : arr) {
            int maxNum = subArr[0];
            for (int num : subArr) {
                if (maxNum < num) {
                    maxNum = num;
                }
            }
            largest[i] = maxNum;
            i++;
        }

        return largest;
    }
}
