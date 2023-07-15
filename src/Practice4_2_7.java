import java.util.ArrayList;

public class Practice4_2_7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("愛知");
        list.add("岐阜");
        list.add("三重");
        list.add("静岡");
        for(String item: list) {
            System.out.print(item + "\t");
        }
        System.out.println("\n2番目の要素を削除");
        list.remove(1);
        for(String item: list) {
            System.out.print(item + "\t");
        }
        System.out.println("\n要素を全て削除");
        list.clear();
        for(String item: list) {
            System.out.print(item + "\t");
        }
    }
}
