import java.util.Scanner;
import java.util.ArrayList;

public class Ex4_2_2 {
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
        for(int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(i + ": " + item);
        }
        scanner.close();
    }
}