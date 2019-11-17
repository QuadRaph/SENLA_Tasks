package task4;

import java.util.Scanner;

//Создать программу, которая подсчитывает сколько раз употребляется слово в
// тексте (без учета регистра). Текст и слово вводится вручную.

public class Words {

    private static int letsCount(String[] text, String pattern) {
        int count = 0;
        for (String word : text) {
            if (word.toUpperCase().matches(pattern.toUpperCase())) {
                count += 1;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите текст:");
        String data = input.nextLine();
        String[] text = data.split(" ");

        System.out.println("Введите слово, чтобы узнать, сколько раз оно встречается в этом предложении:");
        String pattern = input.nextLine().trim();

        System.out.println("Слово (" + pattern + ") встречается в тексте раз: " + letsCount(text, pattern));

        input.close();
    }
}
