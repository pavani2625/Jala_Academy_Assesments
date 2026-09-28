class Program07_InsertElement {

    static int[] insertElement(int[] numbers, int value, int position) {

        int[] newArray = new int[numbers.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = numbers[i];
        }

        newArray[position] = value;

        for (int i = position; i < numbers.length; i++) {
            newArray[i + 1] = numbers[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int value = 25;
        int position = 2;

        int[] result = insertElement(numbers, value, position);

        System.out.println("Array after insertion:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}