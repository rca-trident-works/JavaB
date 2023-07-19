import java.util.HashSet;
import java.util.Scanner;

public class Ex4_4_2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を入力してください (複数入力する場合は半角スペースで区切ってください)");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        for(String word: words) {
            if (set.contains(word)) {
                System.out.println(word + "は重複しています。");
            }
            else {
                set.add(word);
            }
        }

        System.out.println("******setの中******");
        for(String word: set) {
            System.out.println(word);
        }

        scanner.close();
    }

}
