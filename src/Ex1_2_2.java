import java.util.Scanner;

public class Ex1_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(">");
            String input = scanner.nextLine();
            System.out.println(input.length());
        } while (!scanner.nextLine().equals("END"));
        scanner.close();
    }
}
