import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("1. ");
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

        System.out.println("Initial array with " + arr_size + " elements:");
        System.out.println(Arrays.toString(arr));
        System.out.println("2. Bubble sort:");
        System.out.println(Arrays.toString(Bubble.sort(arr)));
        System.out.println("3. Quick sort:");
        System.out.println(Arrays.toString(Quick.sort(arr)));
        System.out.println("4. Gnome sort:");
        System.out.println(Arrays.toString(Gnome.sort(arr)));
        System.out.println("5. Cocktail sort");
        System.out.println(Arrays.toString(Cocktail.sort(arr)));

        System.out.println("\nData structures.\n");

        System.out.println("6. Stack");
        MyStack<Object> myStack = new MyStack<Object>();
        System.out.println(myStack);
        myStack.add("String");
        myStack.add(123);
        System.out.println(myStack);
        Object popped = myStack.pop();
        System.out.println(myStack);
        System.out.println("Popped item is: " + popped);
    }
}