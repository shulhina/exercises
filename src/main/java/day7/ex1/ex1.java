package day7.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
            File file = new File("C:\\just_random_file.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        StringBuilder data = new StringBuilder();
            while(myReader != null && myReader.hasNextLine()){
                data.append(myReader.nextLine());
                data.append("\n");
            }
            System.out.println(data);
    }
}
