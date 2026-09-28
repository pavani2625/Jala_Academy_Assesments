class Program08_MinMaxArray {

    static void findMinMax(int[] numbers) {

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("Minimum value: " + minimum);
        System.out.println("Maximum value: " + maximum);
    }

    public static void main(String[] args) {

        int[] numbers = {40, 10, 50, 20, 30};

        findMinMax(numbers);
    }
}