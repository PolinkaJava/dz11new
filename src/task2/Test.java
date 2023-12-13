package task2;

import java.util.Arrays;
import java.util.Comparator;

public class Test{
    private String[] stroki;

    public Test (String[] stroki) {
        this.stroki = stroki;
    }

    public String[] sortStrings() {
        Arrays.sort(stroki, Comparator.comparingInt(String::length));
        return stroki;
    }
}
