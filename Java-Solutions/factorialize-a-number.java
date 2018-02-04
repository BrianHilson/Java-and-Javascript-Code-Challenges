    public static int factorialize(int num) {
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        
        return product;
    }
