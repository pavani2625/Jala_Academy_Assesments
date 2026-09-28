class Program05_RemoveElement {

    static int[] removeElement(int[] numbers, int valueToRemove) {

        int count = 0;

        // Count how many elements are different from the value
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != valueToRemove) {
                count++;
            }
        }

        int[] newArray = new int[count];

        int index = 0;

        // Copy elements except the value to remove
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] != valueToRemove) {
                newArray[index] = numbers[i];
                index++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int valueToRemove = 30;

        int[] result = removeElement(numbers, valueToRemove);

        System.out.println("Array after removing " + valueToRemove + ":");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}