class Program15_EvenOddCount {

    static void countEvenOdd(int[] numbers) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30, 35};

        countEvenOdd(numbers);
    }
}