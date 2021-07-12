package day10.exercise2;

import java.io.*;

public class Exercise2 {
    /**
     * Creates a copy of the file with a different name.
     */
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\ex2\\testingFile.txt";
        BufferedReader file = new BufferedReader(new FileReader(filePath));

        int i = filePath.lastIndexOf(File.separator);
        String fileName = filePath.substring(i + 1);

        i = fileName.lastIndexOf('.');
        String fileDomain = fileName.substring(0, i);
        String extension = fileName.substring(i + 1);

        String newfileName = filePath.substring(0, filePath.lastIndexOf("\\") + 1) + fileDomain + "_copy." + extension;

        BufferedWriter duplicateFile = new BufferedWriter(new FileWriter(newfileName));

        String curLineContent;
        while ((curLineContent = file.readLine()) != null) {
            duplicateFile.write(curLineContent + System.getProperty("line.separator"));
        }

        file.close();
        duplicateFile.close();

        System.out.println("File was successfully copied!");
    }
}
