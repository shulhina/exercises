package day10.ex4;

import java.io.*;
import java.util.Random;

public class TelephoneNumberWordGenerator {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\ex4\\OriginalPhoneNumber.txt";
        String newfilePath = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\ex4\\EncodedPhoneNumber.txt";


        BufferedReader file = new BufferedReader(new FileReader(filePath));

        BufferedWriter duplicateFile;
            duplicateFile = new BufferedWriter(new FileWriter(newfilePath));

        String curLineContent;
        while ((curLineContent = file.readLine()) != null) {
            duplicateFile.write(curLineContent + System.getProperty("line.separator"));
            System.out.println(numberWordGenerator(phoneInputValidation(curLineContent)));
        }
    }

    private static String phoneInputValidation(String phoneNumber) {
        return phoneNumber.replaceAll("\\D", "");
    }

    public static String numberWordGenerator(String phoneNumber) {
        StringBuilder result = new StringBuilder();
        for (String number : phoneNumber.split("")) {
            Random random = new Random();
            int index = random.nextInt(3);
            String casePhone;
            switch (number) {
                case "1":
                    break;
                case "2":
                    casePhone = "ABC";
                    result.append(casePhone.charAt(index));
                    break;
                case "3":
                    casePhone = "DEF";
                    result.append(casePhone.charAt(index));
                    break;
                case "4":
                    casePhone = "GHI";
                    result.append(casePhone.charAt(index));
                    break;
                case "5":
                    casePhone = "JKL";
                    result.append(casePhone.charAt(index));
                    break;
                case "6":
                    casePhone = "MNO";
                    result.append(casePhone.charAt(index));
                    break;
                case "7":
                    casePhone = "PRS";
                    result.append(casePhone.charAt(index));
                    break;
                case "8":
                    casePhone = "TUV";
                    result.append(casePhone.charAt(index));
                    break;
                case "9":
                    casePhone = "WXYZ";
                    result.append(casePhone.charAt(index));
                    break;


            }
        }
        return String.valueOf(result);
    }
}