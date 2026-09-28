class Program03_FindArrayIndex {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int searchValue = 30;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Index of " + searchValue + ": " + index);
        } else {
            System.out.println(searchValue + " not found in the array");
        }
    }
}