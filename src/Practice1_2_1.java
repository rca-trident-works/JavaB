public class Practice1_2_1 {
    public static void main(String[] args) {
        String str1 = "https://computer.trident.ac.jp/";
        //computerが含まれているか
        if (str1.contains("computer")) {
            System.out.println("computerが含まれます");
        } else {
            System.out.println("computerが含まれません");
        }

        //designが含まれているか
        if (str1.contains("design")) {
            System.out.println("designが含まれます");
        } else {
            System.out.println("designが含まれません");
        }
    }
}
