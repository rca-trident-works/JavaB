public class Ex1_2_1 {
    public static void main(String[] args) {
        String name1 = "https://computer.trident.ac.jp/";
        // ac.jpが含まれているか
        if (name1.contains("ac.jp")) {
            System.out.println("ac.jpが含まれます");
        } else {
            System.out.println("ac.jpが含まれません");
        }
    }
}
