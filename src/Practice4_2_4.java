import java.util.ArrayList;

public class Practice4_2_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("愛知");
        list.add("岐阜");
        list.add("三重");
        list.add("静岡");

        for(String item : list){
            System.out.println(item);
        }
    }
}
