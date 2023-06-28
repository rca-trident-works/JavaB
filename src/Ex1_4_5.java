public class Ex1_4_5 {
    public static void main(String[] args) {
        String text = "<title>こんにちは</title>";
        System.out.println(text.substring(text.indexOf("こん"), text.lastIndexOf("<")));
    }
}
