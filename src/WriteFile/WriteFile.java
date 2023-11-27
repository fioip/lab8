package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("file.txt");
            myWriter.write("Ana are mere. Maria are Mercedes. Nu plange Ana!");
            myWriter.close();
            System.out.println("Successfully wrote in the file!");

        } catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
