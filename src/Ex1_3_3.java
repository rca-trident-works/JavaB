import java.util.Date;

public class Ex1_3_3 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format("%tm/%td/%tY", date, date, date));
    }
}
