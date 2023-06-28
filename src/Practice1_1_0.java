public class Practice1_1_0 {
    public static void main(String[] args) {
        String str = "abc";

        char data[] = {'a', 'b', 'c'};
        String str1 = new String(data);

        String str2 = "abc";
        if (str1 == str2) {
            System.out.println("同じです");
        } else {
            System.out.println("違います");
        }
    }
}
