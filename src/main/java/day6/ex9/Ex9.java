package day6.ex9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex9 {
    public static void main(String[] args) {
        String dateInString = new SimpleDateFormat().format(new Date());
        System.out.println(dateInString);
    }
}
