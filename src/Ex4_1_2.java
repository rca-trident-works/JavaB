public class Ex4_1_2 {
    public static void main(String[] args) {
        int[] scores = {55, 60, 50, 70, 65};
        // 平均値
        int sum = 0;
        for (int num : scores) {
            sum += num;
        }
        System.out.println(sum / scores.length);
    }
}
