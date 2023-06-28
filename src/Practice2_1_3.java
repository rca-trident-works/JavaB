public class Practice2_1_3 {
    public static void main(String[] args) {
        int int1 = 2;
        int int2 = 0;
        try {
            int int3 = int1 / int2;
            System.out.println("int1 / int2 = " + int3);
        }
        catch (ArithmeticException e) {
            System.out.println("0による割り算がされました。");
            System.out.println(e);
        }
        finally {
            System.out.println("finallyブロック処理");
        }
        System.out.println("プログラムを終了します。");
    }
}
