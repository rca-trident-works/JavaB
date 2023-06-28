public class Ex1_5_3 {
    public static void main(String[] args) {
        String data = "12,田中　翔征,巨人\n" +
                "13,山田　裕樹,楽天\n" +
                "14,加藤　郎希,ロッテ\n" +
                "15,小島　翔平,エンゼルス\n";

        String[] lines = data.split("\n");
        String[] names = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(",");
            names[i] = line[1];
        }
        System.out.println(String.join(",", names));
    }
}
