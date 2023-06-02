import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("'If you are good then why are you student' - RT");
            Writer.close();
            System.out.println("Write operation done!");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
};