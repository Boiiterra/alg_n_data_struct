public class Bubble {
    public static int[] sort(int[] array) {
        int[] res = array.clone();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (res[i] > res[j]) {
                    int tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }
        }

        return res;
    }
}
