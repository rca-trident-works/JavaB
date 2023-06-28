public class Ex1_5_2 {
    public static void main(String[] args) {
        String data = "12,田中　翔征,巨人\n" +
                "13,山田　裕樹,楽天\n" +
                "14,加藤　郎希,ロッテ\n" +
                "15,小島　翔平,エンゼルス\n";

        String[] lines = data.split("\n");
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].split(",").length; j++) {
                System.out.print("[" + lines[i].split(",")[j] + "]");
            }
            System.out.println();
        }
    }
}
