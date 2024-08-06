import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HelloWorld.say();

        int maxLen = 30, minLen = 10; // Array data
        int maxInt = 100, minInt = -100; // Array int

        Random rng = new Random();

        if (maxLen < minLen) {
            throw new RuntimeException("Minimum array length shouldn't be bigger than maximum.");
        } else if (maxLen <= 1 || minLen <= 1) {
            throw new RuntimeException("Array length should be more than 1. What will you sort? Minus one numba? WHY?!");
        }

        if (maxInt <= minInt) {
            throw new RuntimeException("Why do you want to sort the same NUMBA?");
        }

        int arr_size = rng.nextInt(maxLen - minLen + 1) + minLen;
        int[] arr = new int[arr_size];

        for (int i = 0; i < arr_size; i++) {
            arr[i] = rng.nextInt(1 + maxInt - minInt) + minInt;
        }

        System.out.println(Arrays.toString(arr));

    }
}