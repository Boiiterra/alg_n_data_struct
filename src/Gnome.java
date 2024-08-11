public class Gnome {
    public static int[] sort(int[] arr) {
        int[] res = arr.clone();

        int pos = 1;

        while (pos < res.length)
            if (pos < 1) pos++;
            else if (res[pos - 1] > res[pos]) {
                int tmp = res[pos - 1];
                res[pos - 1] = res[pos];
                res[pos] = tmp;

                pos--;
            } else
                pos++;

        return res;
    }
}
