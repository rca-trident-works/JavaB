public class Practice2_2_2 {
    public static void main(String[] args) {
        int age1 = -19;
        try {
            if (age1 < 0) {
                throw new Exception("マイナスの年齢が設定されています");
            }
            System.out.println("年齢は" + age1 + "歳ですね");
        }
        catch (Exception e) {
            System.out.println("例外が発生しました");
            System.out.println(e);
        }
    }
}
