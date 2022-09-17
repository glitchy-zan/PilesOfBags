public class Main {
    public static void main(String[] args) {

        int[] arr = {7, 4, 5, 2, 6, 5};

        System.out.println(maxPiles(arr));
    }

    public static int maxPiles(int[] arr) {
        int max = 0;
        int curr = 0;

        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (j == arr.length - 1 || arr[j] >= arr[j + 1]) break;
                else curr += arr[j + 1];
            }
            if (max < curr) max = curr;
        }

        return max;
    }
}
