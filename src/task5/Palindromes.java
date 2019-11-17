package task5;

import java.util.Scanner;

//Создать программу, которая в последовательности от 0 до N, находит все
//числа-палиндромы (зеркальное значение равно оригинальному).
//Длина последовательности N вводится вручную и не должна превышать 100.

public class Palindromes {

    static int reverse(int original) {
        return Integer.parseInt(new StringBuilder(String.valueOf(original)).reverse().toString());
    }

    static void searchPalindromes(int x) {
        System.out.println("Вот ваши палиндромы:");
        int count = 0;
        for (int i = 0; count < x; i++) {
            if (i == reverse(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    private static void exit() {
        System.out.println("Ошибка! Ввод не соответствует критериям. Всего доброго!");
        System.exit(0);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Сколько чисел-палиндромов хотите найти (введите число от 0 до 100):");
        try {
            int data = Integer.parseInt(input.nextLine());
            if (data < 0 || data > 100) {
                exit();
            }
            searchPalindromes(data);
        } catch (NumberFormatException e) {
            exit();
        }

        input.close();
    }
}
