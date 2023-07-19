import java.util.HashSet;
import java.util.Iterator;

public class Practice4_5_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("愛知");
        set.add("岐阜");
        set.add("三重");
        set.add("静岡");

        Iterator<String> ite = set.iterator();
        while (ite.hasNext()) {
            String item = ite.next();
            System.out.println(item);
        }
    }
}
