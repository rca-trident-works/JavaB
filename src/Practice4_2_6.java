import java.util.ArrayList;

public class Practice4_2_6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("東京");
        list.add("名古屋");
        list.add("大阪");
        list.add("福岡");
        for(String item: list) {
            System.out.print(item + "\t");
        }
        System.out.println();
        list.add(1, "静岡");
        for(String item: list) {
            System.out.print(item + "\t");
        }
        System.out.println();
        list.add(4, "広島");
        for(String item: list) {
            System.out.print(item + "\t");
        }
    }
}
