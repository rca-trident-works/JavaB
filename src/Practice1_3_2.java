import java.util.Date;

public class Practice1_3_2 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%1$tY年%1$tm月%1$td日", date));
    }
}
