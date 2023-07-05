import java.io.FileWriter;

public class Ex3_2_1 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("Ex3.txt")) {
            fileWriter.write("Ex3_2_1");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
