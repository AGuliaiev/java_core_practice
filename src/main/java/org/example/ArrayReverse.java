package org.example;

public class ArrayReverse {
    public static int[] toReversedArray(long number) {

        String str = String.valueOf(number);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }

        return arr2;
        // write code here
    }
}
