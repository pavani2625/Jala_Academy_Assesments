class Program02_ArrayAverage {

    static double calculateAverage(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        double average = calculateAverage(numbers);

        System.out.println("Average of array: " + average);
    }
}