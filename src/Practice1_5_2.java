public class Practice1_5_2 {
    public static void main(String[] args) {
        String text2 = "192.168.1.255";
        String[] result2 = text2.split("\\.");
        for (int i = 0; i < result2.length; i++) {
            String data = result2[i];
            System.out.println("[" + data + "]");
        }
    }
}
