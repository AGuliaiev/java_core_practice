package org.example;

public class Drinking {
    public static String hydrate(String drinks) {
        String[] arr = drinks.split(" ");
        int sum = 0;
        for (String s : arr) {
            if (s.matches("\\d+")) {
                sum += Integer.parseInt(s);
            }
        }
        return sum == 1 ? sum + " glass of water" : sum + " glasses of water";
        // write code here
    }
}

//Mate Bar рекомендує випивати по одній склянці води на кожен стандартний напій, щоб на наступний день не було похмілля.
//
//Реалізуй метод hydrate(), який приймає рядок drinks, що представляє напої, які ти збираєшся пити.
//
//Наприклад: String drinks = "3 beers and 1 glass of rum"
//
//Поверни рядок з інформацією, скільки склянок води потрібно випити, щоб не було похмілля.
//
//Приклади:
//
//"1 beer" ==> "1 glass of water"
//оскільки ти вип'єш один стандартний напій
//
//"1 shot, 5 ciders and 1 glass of wine" ==> "7 glasses of water"
//оскільки ти вип'єш сім стандартних напоїв
