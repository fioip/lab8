package CreateFile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("file.txt");
            if(myFile.createNewFile()) {
                System.out.println("File created!");
            }
            else {
                System.out.println("File already exists!");
            }

        }catch (IOException e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}
