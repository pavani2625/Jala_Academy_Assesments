class Program06_CopyArray {

    static int[] copyArray(int[] original) {

        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        return copy;
    }

    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};

        int[] copy = copyArray(original);

        System.out.println("Original array:");

        for (int i = 0; i < original.length; i++) {
            System.out.println(original[i]);
        }

        System.out.println("Copied array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}