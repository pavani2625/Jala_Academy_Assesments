class Program11_CommonValues {

    public static void main(String[] args) {

        int[] firstArray = {10, 20, 30, 40, 50};
        int[] secondArray = {30, 40, 50, 60, 70};

        System.out.println("Common values:");

        for (int i = 0; i < firstArray.length; i++) {

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i] == secondArray[j]) {
                    System.out.println(firstArray[i]);
                    break;
                }
            }
        }
    }
}