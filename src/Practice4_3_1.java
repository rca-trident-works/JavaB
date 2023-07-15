import java.util.ArrayList;
import java.util.Arrays;

public class Practice4_3_1 {
    public static void main(String[] args) {
        String[] array = {"りんご", "バナナ", "いちご"};
        // 配列からListに変換
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        list.add("マンゴー");
        list.add("みかん");
        list.add("スイカ");

        System.out.println("****リスト****");
        for(String s: list) {
            System.out.println(s);
        }
        //Listから配列に変換
        String[] array2 = list.toArray(new String[list.size()]);
        System.out.println("****配列****");
        for(String s: array2) {
            System.out.println(s);
        }
    }
}
