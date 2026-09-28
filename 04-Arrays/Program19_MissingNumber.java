class Program19_MissingNumber {

    static int findMissingNumber(int[] numbers) {

        int expectedSum = 0;
        int actualSum = 0;

        for (int i = 1; i <= 100; i++) {
            expectedSum = expectedSum + i;
        }

        for (int i = 0; i < numbers.length; i++) {
            actualSum = actualSum + numbers[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] numbers = new int[99];

        int index = 0;

        for (int i = 1; i <= 100; i++) {

            if (i != 57) {
                numbers[index] = i;
                index++;
            }
        }

        int missingNumber = findMissingNumber(numbers);

        System.out.println("Missing number: " + missingNumber);
    }
}