import java.util.Scanner;

public class Ex1_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println(">");
            input = scanner.nextLine();
            System.out.println(input.length());
        } while (!input.toUpperCase().contains("END"));
        scanner.close();
    }
}
