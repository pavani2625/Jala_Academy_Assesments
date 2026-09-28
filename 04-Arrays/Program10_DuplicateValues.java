class Program10_DuplicateValues {

    static void findDuplicates(int[] numbers) {

        System.out.println("Duplicate values:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 50, 30};

        findDuplicates(numbers);
    }
}