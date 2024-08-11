public class Cocktail {
    public static int[] sort(int[] arr) {
        int[] res = arr.clone();

        for (int i = 0; i < res.length / 2; i++) {
            for (int j = i; j < res.length - i; j++) {
                if (res[i] < res[j]) {
                    int tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }

            for (int j = res.length - 1 - i; j > i; j--) {
                if (res[j] < res[i]) {
                    int tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }
        }

        return res;
    }
}
