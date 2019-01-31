public class Massiv230 {
    public static void main(String[] args) {
        int[] mass = {4, 2, 6, -1, 4, 0, 5, -34, 8, 23, 10};
        for (int i = 0; i < mass.length; i++) {
            int j = i;
            for (int k = i + 1; k < mass.length; k++) {
                if (mass[k] < mass[j]) {
                    j = k;
                }
            }
            int tmp = mass[i];
            mass[i] = mass[j];
            mass[j] = tmp;
        }
        System.out.println((mass[mass.length / 2]));
    }
}
