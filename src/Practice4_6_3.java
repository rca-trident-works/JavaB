import java.util.HashMap;
public class Practice4_6_3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(21, "岐阜");
        map.put(22, "静岡");
        map.put(23, "愛知");
        map.put(24, "三重");

        for (int key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
