import java.io.FileWriter;
import java.io.IOException;

public class Ex3_1_1 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("Ex3.txt")) {
            fileWriter.write("Ex3_1_1");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
