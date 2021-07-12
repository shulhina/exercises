package day10.ex1;

import java.io.*;

public class Ex1 {
    public static void main(String[] args) throws IOException {

        String fileOut = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\day11.ex1\\fileOutput.txt";
        String fileIn = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\day11.ex1\\fileInput.txt";
        String output = "This is text for output file in case of error";

        FileOutputStream fos;
        DataOutputStream dos;

        FileInputStream fis;
        DataInputStream dis;

        try {

            fos = new FileOutputStream(fileOut);
            dos = new DataOutputStream(fos);

            fis = new FileInputStream(fileIn);
            dis = new DataInputStream(fis);

            output = dis.readLine();
            System.out.println("Output: " + output);
            dos.writeBytes(output);

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found" + fnfe);
        } catch (IOException ioe) {
            System.out.println("Error while writing to file" + ioe);
        }

    }
}
