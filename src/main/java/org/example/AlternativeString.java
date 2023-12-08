package org.example;

public class AlternativeString {
    public static String toAlternativeCase(String string) {
        // write code here
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}

//Реалізуй метод toAlternativeCase(), який приймає рядок string та повертає новий рядок, в якій кожна мала літера з вхідного рядка стає великою, а кожна велика - малою.
//
//Приклади:
//
//"hello world" // повертає "HELLO WORLD"
//"H3LLo WoRLD!" // повертає "h3llO wOrld!"
