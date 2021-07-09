package day10.ex4;

import java.util.Random;
import java.util.Scanner;

public class TelephoneNumberWordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to encode!");
        int number = sc.nextInt();

    }

    public String numberWordGenerator(String phoneNumber){
        StringBuilder result = null;
        for (String number : phoneNumber.split("")){
            Random random = new Random();
            int index = random.nextInt(3);
            switch(number){
                case "1":
                    break;
                case "2":
                    String case1 = "ABC";
                    result.append(case1.charAt(index));
                    break;
                case "3":
                    String case2 = "DEF";
                    result.append(case2.charAt(index));
                    break;

            }
        }
        return String.valueOf(result);
    }
}
