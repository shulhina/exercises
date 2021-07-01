package day5.ex1;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(maxCharacter("aaafbbbdeeeda"));
        System.out.println(maxCharacter("eeddfssses"));
        System.out.println(maxCharacter("eeddfssesee"));
    }

    public static int maxCharacter(String str) {

        // 256 characters exist
        int[] count = new int[256];
        int len = str.length();
        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return str.indexOf(result);
    }
}