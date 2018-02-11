    public static boolean confirmTheEnding(String str, String target) {
        int distanceToEnd = str.length()-target.length();
        if (distanceToEnd < 0) {
            return false;
        }
        String ending = str.substring(distanceToEnd);
        return ending.equals(target);
    }
