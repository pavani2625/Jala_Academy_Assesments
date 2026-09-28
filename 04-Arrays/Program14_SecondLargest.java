class Program14_SecondLargest {

    static int findSecondLargest(int[] numbers) {

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] numbers = {15, 60, 25, 45, 35};

        int result = findSecondLargest(numbers);

        System.out.println("Second largest number: " + result);
    }
}