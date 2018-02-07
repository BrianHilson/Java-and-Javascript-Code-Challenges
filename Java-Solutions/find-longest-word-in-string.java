    public static int longestWordLength(String str) {
        String[] stringArray = str.split(" ");
        int greatestNum = 0;
        for (String word : stringArray) {
            if (word.length() > greatestNum) {
                greatestNum = word.length();
            }
        }
        return greatestNum;
    }
