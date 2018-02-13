package chopoffhead;

public class ChopOffHead {

    public static void main(String[] args) {
        
    }
    
    public static String[] chopOffHead(String[] arr, int num) {
        String[] headRemoved = new String[arr.length-num];
        int j = 0;
        for (int i = num; i < arr.length; i++) {
            headRemoved[j] = arr[i];
            j++;
        }

        return headRemoved;
    }
}
