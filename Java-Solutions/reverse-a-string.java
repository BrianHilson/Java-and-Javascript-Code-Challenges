    public static String reverseString(String str) {
        int strLength = str.length();
        String[] array = str.split("");
        String[] reverseArray = new String[strLength];

        for (int i = 0; i < strLength; i++) {
            reverseArray[strLength - (i + 1)] = array[i];
        }

        StringBuilder reverseString = new StringBuilder();
        for (String thisChar : reverseArray) {
            reverseString.append(thisChar);
        }

        return reverseString.toString();
    }
