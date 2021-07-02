package day6.ex8;

import java.util.Comparator;

public class StringReverseSortComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}