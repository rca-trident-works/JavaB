public class Practice1_1_1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); //true

        String str3 = new String("hello");
        System.out.println(str1 == str3); //false
        //追加
        System.out.println(str1.equals(str3)); //true
    }
}
