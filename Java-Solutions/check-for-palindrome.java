    public static boolean checkForPalindromes (String str) {
        String toRemove = "[!@#$%^&*:><?;\\}\\{\\s]";
        String cleanedStr = str.toLowerCase().replaceAll(toRemove, "");
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }
