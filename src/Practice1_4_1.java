public class Practice1_4_1 {
    public static void main(String[] args) {
        String text1 = "<title>こんにちは</title>";
        // 0から始まる文字の位置. 第2引数の手前まで
        System.out.println("7-12: " + text1.substring(7, 12));
        // 第2引数を省略すると, 最後を指定したときと同じ
        System.out.println("7-END: " + text1.substring(7));
    }
}
