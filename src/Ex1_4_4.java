public class Ex1_4_4 {
    public static void main(String[] args) {
        String text = "http://computer.trident.ac.jp/http_status_list";
        System.out.println(text.substring(text.indexOf("computer"), text.lastIndexOf("/")));
    }
}
