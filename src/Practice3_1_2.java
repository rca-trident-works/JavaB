import java.io.FileWriter;
import java.io.IOException;

public class Practice3_1_2 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("Practice3.txt")) {
            fileWriter.write("try~with~resources");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
