import java.util.Scanner;
import java.util.ArrayList;

public class Ex4_2_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("バナナ");
        list.add("いちご");
        list.add("りんご");
        Scanner scanner = new Scanner(System.in);
        System.out.print("0~2を入力してください: ");
        int num = scanner.nextInt();
        String item = list.get(num);
        System.out.println(item);
        scanner.close();
    }
}
