import java.util.ArrayList;

public class Practice4_8_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("東京");
        list.add("名古屋");
        list.add("大阪");
        list.add("福岡");

        list.forEach(str -> System.out.print(str + "\t"));
    }
}
