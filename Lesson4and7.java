public class Lesson4and7 {
    public static void main(String[] args) {
        int i1, i2;
        int[] mass = new int[20];
        mass[0] = 1;
        mass[1] = 1;
        for (int i = 2; i < 20; i++) {
            mass[i] = mass[(i - 2)] + mass[(i - 1)];
        }
        for (int i:mass) {
            System.out.print(i+ " ");

        }
    }
}
