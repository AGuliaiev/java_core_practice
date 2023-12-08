package org.example;

public class TruncNumbers {
    public static double truncateToHundredth(double num) {
        return (int) (num * 100) / 100.0;
        // write code here
    }
}

// Реалізуй метод truncateToHundredth(), який приймає число num і форматує його так, що воно поверталося лише з двома знаками після коми.
//
//Не округляй числа, просто видали все, що стоїть після двох знаків після коми!
//
//Приклади:
//
//32.8493 ==> 32.84
//14.3286 ==> 14.32

//java.lang.AssertionError: Method should truncate a negative number to two decimal places  expected:<-35.93> but was:<-35.94>
