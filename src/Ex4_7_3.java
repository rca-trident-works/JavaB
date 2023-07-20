import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex4_7_3 {
    public static void main(String[] args) {
        String[] words = {
                "juice", "house", "notebook", "elephant", "queen", "pizza", "mountain", "apple",
                "flower", "orange", "sun", "kangaroo", "girl", "lion", "dog", "cat", "rainbow",
                "tree", "ice cream", "book"
        };
        // 配列をリストに変換
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(words));
        // ソート
        Collections.sort(list);
        String[] words2 = list.toArray(new String[0]);
        System.out.println("ソートして表示します");
        for (int i = 0; i < words2.length; i++) {
            System.out.println((i + 1) + ": " + words2[i]);
        }
    }
}
