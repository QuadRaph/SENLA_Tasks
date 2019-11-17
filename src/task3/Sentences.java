package task3;

import java.util.Scanner;

//  Создать программу, которая будет:
//       * подсчитывать количество слов в предложении
//       * выводить их в отсортированном виде
//       * делать первую букву каждого слова заглавной.
//       * Предложение вводится вручную. (Разделитель пробел (“ ”)). - ??

public class Sentences {

    private static void sortText(String text) {
        String[] sentence = text.split(" ");
        System.out.print("Отсортированное предложение: ");
        int count = 0;
        for (String word : sentence) {
            if (!word.isEmpty()) {
                System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
                if (!word.matches("\\p{Punct}+")) {
                    count += 1;
                }
            }
        }
        System.out.println("\nКоличество слов в предложении: " + count);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String data = input.nextLine();
        sortText(data);

        input.close();
    }

}
