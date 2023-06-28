import java.util.Date;

public class Practice1_3_3 {
    public static void main(String[] args) {
        double temp = 22.19;
        Date today = new Date();
        System.out.println(String.format("今日は、%1$tY年%1$tm月%1$td日。気温は%2$.1f度", today, temp));
    }
}
