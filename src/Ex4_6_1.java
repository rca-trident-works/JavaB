import java.util.HashMap;

public class Ex4_6_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("カレーうどん", 808);
        map.put("五目うどん", 769);
        map.put("きつねうどん", 641);
        map.put("月見うどん", 611);
        map.put("海老天うどん", 592);

        for(String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " : " + value + "kcal");
        }
    }
}
