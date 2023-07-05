public class Ex2_2_1 {
    public static void main(String[] args) {
        int int1 = 2;
        int int2 = 0;
        try {
            if (int2 == 0) {
                throw new Exception("0による割り算をしようとしています");
            }
            else {
                int int3 = int1 / int2;
                System.out.println("int1 / int2 = " + int3);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
