class Program16_LargestSmallestDifference {

    static int findDifference(int[] numbers) {

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 50, 20, 40, 30};

        int difference = findDifference(numbers);

        System.out.println("Difference: " + difference);
    }
}