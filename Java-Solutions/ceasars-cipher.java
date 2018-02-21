
/* From FreeCodeCamp: https://www.freecodecamp.org/challenges/caesars-cipher

"One of the simplest and most widely known ciphers is a Caesar cipher, 
also known as a shift cipher. In a shift cipher the meanings of the 
letters are shifted by some set amount.
A common modern use is the ROT13 cipher, where the values of the letters 
are shifted by 13 places. Thus 'A' ↔ 'N', 'B' ↔  'O' and so on.
Write a function which takes a ROT13 encoded string as input and 
returns a decoded string.
All letters will be uppercase. Do not transform any non-alphabetic 
character (i.e. spaces, punctuation), but do pass them on." */

package ceasarscypher;

public class CeasarsCypher {

    public static String rot13(String str) {
        String returnStr = "";
        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i);
            if (code > 64 && code < 91) {
                code += 13;
                if (code > 90) {
                    code -= 26;
                }
            }
            char ch = (char) code;
            returnStr += String.valueOf(ch);
        }
        return returnStr;
    }
}
