import java.util.ArrayList;
import java.util.Collections;

public class Practice4_7_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("ええええ");
        list.add("いいいい");
        list.add("ああああ");
        list.add("うううう");

        System.out.println("*****昇順");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("*****降順");
        Collections.reverse(list);
        System.out.println(list);
    }
}
