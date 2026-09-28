class Program09_ReverseArray {

    static void reverseArray(int[] numbers) {

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {

            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        reverseArray(numbers);

        System.out.println("Reversed array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}