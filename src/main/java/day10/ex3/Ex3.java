package day10.ex3;

import java.io.*;

public class Ex3 {
    /**
     * Creates a copy of the file with a different name.
     */
    public static void main(String[] args) {
        String filePath = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\ex3\\testingFile.txt";
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int i = filePath.lastIndexOf(File.separator);
        String fileName = filePath.substring(i + 1);

        i = fileName.lastIndexOf('.');
        String fileDomain = fileName.substring(0, i);
        String extension = fileName.substring(i + 1);

        String newfileName = filePath.substring(0, filePath.lastIndexOf("\\") + 1) + fileDomain + "_copy." + extension;


        BufferedWriter duplicateFile = null;
        try {
            duplicateFile = new BufferedWriter(new FileWriter(newfileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String curLineContent = null;
        while (true) {
            try {
                if ((curLineContent = file != null ? file.readLine() : null) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (duplicateFile != null) {
                    duplicateFile.write(curLineContent + System.getProperty("line.separator"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            if (file != null) {
                file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (duplicateFile != null) {
                duplicateFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File was successfully copied!");
    }
}
