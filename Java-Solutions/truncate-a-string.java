    public static String truncateString(String str, int num) {
        if ((str.length() - num) <= 0) {
            return str;
        } else if (num < 4) {
            return str.substring(0, num) + "...";
        } else {
            return str.substring(0, num - 3) + "...";
        }
    }
