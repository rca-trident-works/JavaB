import java.util.ArrayList;

public class Ex4_8_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("バナナ");
        list.add("りんご");
        list.add("ピーチ");
        list.add("オレンジ");

        list.forEach(item -> System.out.println(item));
    }
}
