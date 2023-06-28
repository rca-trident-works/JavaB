public class Ex2_1_1 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        try {
            array1[0] = 1;
            array1[1] = 2;
            array1[2] = 3;
            array1[3] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("配列のインデックスが範囲より超えました。");
        }
        System.out.println("プログラムを終了します。");
    }
}
