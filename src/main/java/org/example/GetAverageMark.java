package org.example;

public class GetAverageMark {
public static int getAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
        // write your code here
    }

}
