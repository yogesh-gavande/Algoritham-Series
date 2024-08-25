public class pairs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPairs(arr);
    }

    public static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }
}
