import java.util.HashSet;
import java.util.Scanner;

public class Ex4_4_1 {

    public static void main(String[] args) {
        char lastChar = '\u0000';
        HashSet<String> set = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("しりとりをします、ひらがなで入力してください。");
        while(scanner.hasNext()) {
            String s = scanner.next();
            char saisho = s.charAt(0);
            if (lastChar != '\u0000' && lastChar != saisho) {
                System.out.println("最初が「" + lastChar + "」ではありません。");
                break;
            }
            char saigo = s.charAt(s.length() - 1);
            if (saigo == 'ん') {
                System.out.println("最後が「ん」です。");
                break;
            }
            if (!set.add(s)) {
                System.out.println("２度目です。");
                break;
            }
            lastChar = s.charAt(s.length() - 1);
        }
    }
}
