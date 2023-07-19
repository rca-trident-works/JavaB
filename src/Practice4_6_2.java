import java.util.HashMap;
import java.util.Scanner;

public class Practice4_6_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(21, "岐阜");
        map.put(22, "静岡");
        map.put(23, "愛知");
        map.put(24, "三重");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        Scanner scanner = new Scanner(System.in);
        System.out.println("都道府県番号を入力してください。");
        int num = scanner.nextInt();
        if (map.containsKey(num)) {
            System.out.println(map.get(num));
        } else {
            System.out.println("存在しないキーです");
        }
        scanner.close();
    }
}
