public class Ex4_1_1 {
    public static void main(String[] args) {
        int[] scores = {55, 60, 50, 70, 65};

        //拡張for文を使用して最大値を求める
        int max = 0;
        for (int num : scores) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
