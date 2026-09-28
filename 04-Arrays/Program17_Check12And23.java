class Program17_Check12And23 {

    static boolean containsBoth(int[] numbers) {

        boolean contains12 = false;
        boolean contains23 = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 12) {
                contains12 = true;
            }

            if (numbers[i] == 23) {
                contains23 = true;
            }
        }

        return contains12 && contains23;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 12, 15, 23, 30};

        if (containsBoth(numbers)) {
            System.out.println("Array contains both 12 and 23");
        } else {
            System.out.println("Array does not contain both 12 and 23");
        }
    }
}