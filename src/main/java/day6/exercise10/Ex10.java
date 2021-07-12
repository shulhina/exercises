package day6.exercise10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10 {
    public static void main(String[] args) {
        String pattern = "hh:mm aa";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());
        System.out.println(dateInString);
    }
}
