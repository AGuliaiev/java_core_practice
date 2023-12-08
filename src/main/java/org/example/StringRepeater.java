package org.example;

public class StringRepeater {
    public static String repeatStr(final int repeat, final String string) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
