package day4.exercise1;

public class UserMainCode {
    public int checkCharacters(String input) {
        if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
            return 1;
        } else {
            return 0;
        }
    }
}

