import java.sql.SQLOutput;

public class HomeTask2 {
    public static void main(String[] args) {
        String s = "";
        int i = 545, core, add;
        while ( i>=16 ) {
            core = i / 16;
            add = i % 16;
            s = add + s;
            i = core;
        }
        s = i + s;
        System.out.println(s);
    }
}
