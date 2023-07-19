import java.util.HashSet;

public class Practice4_4_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("りんご");
        set.add("バナナ");
        set.add("いちご");

        if (set.add("バナナ") == false) {
            System.out.println("バナナは追加できない");
        }

        if (set.contains("バナナ")) {
            System.out.println("バナナはすでに存在する");
        }

        System.out.println("******setの中******");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
