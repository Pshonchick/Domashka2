public class HomeTask {
    public static void main(String[] args) {
        String s = "";
        int i = 545, core, add;
        while (i / 2 >= 1 || i == 2) {
            core = i / 2;
            add = i % 2;
            s = add + s;
            i = core;
        }
        s=i+s;
        System.out.println(s);
    }
}
