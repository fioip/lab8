package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){

        try {
            File myFile = new File("read.txt");
            if(myFile.createNewFile()) {
                System.out.println("File created!");
            }
            else {
                System.out.println("File already exists!");
            }

            Scanner reader = new Scanner(myFile);

            FileWriter myWriter = new FileWriter("read.txt");
            myWriter.write("Ana are mere. Maria are Mercedes. Nu plange Ana!");

            System.out.println("Successfully wrote in the file!");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            myWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
