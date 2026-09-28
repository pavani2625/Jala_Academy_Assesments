class Program12_RemoveDuplicates {

    static int[] removeDuplicates(int[] numbers) {

        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[index] = numbers[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 30};

        int[] result = removeDuplicates(numbers);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}