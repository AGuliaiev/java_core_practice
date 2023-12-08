package org.example;

public class Dictionary {
    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String term) {
        // write your code here
        int min = Integer.MAX_VALUE;
        String result = "";
        for (String word : words) {
            int distance = levenshteinDistance(term, word);
            if (distance < min) {
                min = distance;
                result = word;
            }
        }
        return result;
    }

    private int levenshteinDistance(String term, String word) {
        int[][] dp = new int[term.length() + 1][word.length() + 1];
        for (int i = 0; i <= term.length(); i++) {
            for (int j = 0; j <= word.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) dp[i][j] = i;
                else if (term.charAt(i - 1) == word.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1],
                        dp[i - 1][j]));
            }
        }
        return dp[term.length()][word.length()];
    }
}

//Напевно тобі знайоме повідомлення від Google "Можливо, Ви мали на увазі ...?", коли вводиш пошуковий запит і помиляєшся в слові. У цьому завданні ми хочемо реалізувати щось подібне.
//
//Ти отримаєш введений термін term (рядок в нижньому регістрі) і масив відомих слів words (також рядки в нижньому регістрі). Твоя задача - з'ясувати, яке слово зі словника найбільш схоже на введене. Подібність описується мінімальною кількістю букв, які потрібно додати, прибрати або замінити, щоб перейти від введеного слова до одного зі словника.
//
//Чим менше кількість необхідних змін, тим вище подібність між двома словами. Однакові слова, очевидно, є найбільш схожими.
//
//Слово, в якому потрібно змінити одну букву, більш схоже на інше слово, в якому необхідно змінити 2 (або більше) літери. Наприклад, помилковий термін berr більше схожий на beer (потрібно замінити 1 букву), ніж на barrel (всього потрібно замінити 3 літери).
//
//Підказка: подивись алгоритм Levenshtein distance.
//
//Приклади:
//
//Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
//fruits.findMostSimilar("strawbery"); // повертає "strawberry"
//fruits.findMostSimilar("berry"); // повертає "cherry"
//
//Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
//things.findMostSimilar("coddwars"); // повертає "codewars"
//
//Dictionary languages = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
//languages.findMostSimilar("heaven"); // повертає "java"
//languages.findMostSimilar("javascript"); // повертає "javascript" (однакові слова є найбільш схожими)
//
//Примітки:
//
//в цьому завданні рядок java більш схожий на heaven, ніж всі інші.
//завжди існує рівно один можливий правильний варіант
