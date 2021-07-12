package day6.exercise11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise11 {
    public static void main(String[] args) {
        String pattern = "yyyy-MM-dd HH:mm";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());
        System.out.println(dateInString);
    }
}