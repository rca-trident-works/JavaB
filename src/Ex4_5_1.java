import java.util.ArrayList;
import java.util.Iterator;

public class Ex4_5_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("バナナ");
        list.add("りんご");
        list.add("ピーチ");
        list.add("オレンジ");

        Iterator<String> ite = list.iterator();
        while(ite.hasNext()) {
            String item = ite.next();
            System.out.println(item);
        }
    }
}
