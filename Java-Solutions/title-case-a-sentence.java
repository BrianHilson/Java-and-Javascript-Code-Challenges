package titlecaseasentence;

import java.lang.String;
import java.util.Arrays;

public class TitleCaseASentence {

    public static void main(String[] args) {
        
    }

    public static String titleCaseASentence(String sentence) {
        String[] wordArray = sentence.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            String firstLetter = wordArray[i].substring(0, 1).toUpperCase();
            String restOfWord = wordArray[i].substring(1).toLowerCase();
            wordArray[i] = firstLetter + restOfWord;
        }
        
        String newSentence = String.join(" ", wordArray);
        return newSentence;
    }

}

