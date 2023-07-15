import java.util.ArrayList;
import java.util.Arrays;

public class Ex4_3_1 {
    public static void main(String[] args) {
        String[] bullet = {"東京", "新横浜", "名古屋", "京都", "新大阪"};
        for (String s: bullet) {
            System.out.print(s + "\t");
        }
        System.out.println();

        // 配列からListに変換
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(bullet));
        list.add(1, "品川");
        list.add(3, "浜松");

        // Listから配列に変換
        bullet = list.toArray(new String[list.size()]);
        for (String s: bullet) {
            System.out.print(s + "\t");
        }
    }
}
