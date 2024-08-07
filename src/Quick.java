public class Quick {
    private static void the_sort(int[] arr, int bot, int top) {
        if (bot < top) {
            int pivot_pos = partition(arr, bot, top);

            the_sort(arr, bot, pivot_pos - 1);
            the_sort(arr, pivot_pos + 1, top);
        }
    }

    private static int partition(int[] arr, int bot, int top) {
        int pivot_pos = bot - 1;
        int numba = arr[top];

        for (int cur = bot; cur < top; cur++) {
            if (arr[cur] < numba) {
                pivot_pos++;

                int tmp = arr[cur];
                arr[cur] = arr[pivot_pos];
                arr[pivot_pos] = tmp;
            }
        }

        pivot_pos++;
        arr[top] = arr[pivot_pos];
        arr[pivot_pos] = numba;

        return pivot_pos;
    }

    public static int[] sort(int[] arr) {
        int[] res = arr.clone();

        the_sort(res, 0, res.length - 1);

        return res;
    }
}
