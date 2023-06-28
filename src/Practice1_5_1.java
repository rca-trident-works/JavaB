public class Practice1_5_1 {
    public static void main(String[] args) {
        String text1 = "愛知県 名古屋市 中村区 名駅 3-24-15";
        String[] result1 = text1.split(" ");
        for (int i = 0; i < result1.length; i++) {
            String data = result1[i];
            System.out.println("[" + data + "]");
        }
    }
}
