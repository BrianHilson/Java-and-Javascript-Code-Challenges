package firststringcontainssecond;

public class FirstStringContainsSecond {

    public static void main(String[] args) {
        
    }

    public static boolean firstContainsSecond(String[] input) {
        String first = input[0].toLowerCase();
        String second = input[1].toLowerCase();

        for (int i = 0; i < second.length(); i++) {
            if (first.indexOf(second.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
