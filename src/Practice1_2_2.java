import java.util.Scanner;

public class Practice1_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println(">");
            // Enterキーの入力待ち
            input = scanner.nextLine();
            // 入力された文字列を表示
            System.out.println(input);
            //改行以外の入力があれば、入力を繰り返す
        } while (input.length() != 0);
        System.out.println("処理終了");
        scanner.close();
    }
}

