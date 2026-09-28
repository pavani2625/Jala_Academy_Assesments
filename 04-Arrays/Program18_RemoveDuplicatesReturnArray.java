class Program18_RemoveDuplicatesReturnArray {

    static int[] removeDuplicates(int[] numbers) {

        int uniqueCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                uniqueCount++;
            }
        }

        int[] newArray = new int[uniqueCount];

        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArray[index] = numbers[i];
                index++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 30};

        int[] result = removeDuplicates(numbers);

        System.out.println("New array after removing duplicates:");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}