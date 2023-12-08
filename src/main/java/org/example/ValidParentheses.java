package org.example;

public class ValidParentheses {
    public static boolean isValidParentheses(String string) {
        // write your code here
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

//Реалізуй метод isValidParentheses(), який приймає рядок string і визначає, чи дійсний в ньому порядок дужок ( та ).
//
//Метод повинен повертати true, якщо порядок дійсний, і false, якщо ні.
//
//Приклади:
//
//isValidParentheses("()") == true
//isValidParentheses("())") == false
//isValidParentheses("(abc())") == true
//isValidParentheses(")(()))") == false
