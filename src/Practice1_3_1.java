public class Practice1_3_1 {
    public static void main(String[] args) {
        double number = 3.141492;
        System.out.println(String.format("%f", number)); //そのまま表示
        System.out.println(String.format("%.2f", number)); //小数点以下2桁まで表示
    }
}
