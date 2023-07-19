import java.util.HashMap;
import java.util.Scanner;

public class Ex4_6_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ctrl+Zキーで終了します");
        System.out.println("番号を入力してください");
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if (map.containsKey(num)) {
                System.out.println("重複しています\n番号を入力してください");
            }
            else {
                System.out.println("名前を入力してください");
                String name = scanner.next();
                map.put(num, name);
                System.out.println("番号を入力してください");
            }
        }
        System.out.println(map.entrySet());
        scanner.close();
    }

}
