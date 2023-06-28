public class Practice1_5_3 {
    public static void main(String[] args) {
        String text3 = "split()メソッドは、引数として指定された正規表現で文字列を分割し、String型の配列で返却する。分割された各部文字列は、配列の要素として格納される。";
        String[] result3 = text3.split("、|。");
        for (int i = 0; i < result3.length; i++) {
            String data = result3[i];
            System.out.println("[" + data + "]");
        }
    }
}
