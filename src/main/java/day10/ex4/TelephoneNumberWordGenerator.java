package day10.ex4;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
    public void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to encode: ");
        String number = sc.next();
*/
        String filePath = "C:\\Users\\yelyzaveta_shulhina\\IdeaProjects\\exe\\src\\main\\java\\day10\\ex4\\OriginalPhoneNumber.txt";

        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        number = phoneInputValidation(number);
        System.out.println(numberWordGenerator(number));

        BufferedWriter duplicateFile = null;
        try {
            duplicateFile = new BufferedWriter(new FileWriter(newfileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String phoneInputValidation(String phoneNumber) {
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
