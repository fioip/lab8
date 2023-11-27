package DeleteFile;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myFile = new File("read.txt");

        if (myFile.delete()) {
            System.out.println("Delete the file: "+ myFile.getName());
            System.out.println("File deleted successfully!");
        } else {
            System.out.println("Failed to delete the file!");
        }
    }
}
