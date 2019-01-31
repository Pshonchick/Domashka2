public class Vstavka {
    public static void main(String[] args) {
        int[] mass = {1, -6, 12, 94, 14};
        int j, temp;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                temp = mass[i + 1];
                mass[i + 1] = mass[i];
                j = i;
                while (j > 0 && temp < mass[j - 1]) {
                    mass[j] = mass[j - 1];
                    j--;
                }
                mass[j] = temp;
            }
        }
        for (int i1 : mass) {
            System.out.println(i1);
        }

    }
}
