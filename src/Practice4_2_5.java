import java.util.ArrayList;
class Human {
    String name;
    int age;
    Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    void showInfo() {
        System.out.println(name + age + "才");
    }
}
public class Practice4_2_5 {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();
        list.add(new Human("藤井流星", 23));
        list.add(new Human("山下智久", 38));
        list.add(new Human("滝沢秀明", 42));
        list.add(new Human("佐藤龍我", 20));
    }
}
