import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_2_3 {
    // Ex4_2_2をExtended for文を使って書き換える
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("繰り返し何か入力してください");
        System.out.println("「end」と入力したら終わりです。");
        while(scanner.hasNext()) {
            String s = scanner.next();
            if (s.equals("end")) {
                break;
            }
            list.add(s);
        }
        System.out.println("入力された内容の一覧です。");
        for(String item : list) {
            System.out.println(item);
        }
        scanner.close();
    }
}
