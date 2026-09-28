class Program04_ArrayContainsValue {

    static boolean containsValue(int[] numbers, int searchValue) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int searchValue = 40;

        if (containsValue(numbers, searchValue)) {
            System.out.println(searchValue + " is present in the array");
        } else {
            System.out.println(searchValue + " is not present in the array");
        }
    }
}