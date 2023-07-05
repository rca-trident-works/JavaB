import java.io.FileWriter;
import java.io.IOException;

public class Practice3_1_1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Practice3.txt");
            fileWriter.write("try~catch~finally");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
