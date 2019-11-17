package task2;

import java.math.BigInteger;
import java.util.Scanner;

// Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и
// НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
// Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.

public class GCD {

    private static int getGCD(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    private static int getLCM(int a, int b) {
        return a * (b / getGCD(a, b));
    }

    private static void exit() {
        System.out.println("Ошибка! Ввод не соответствует критериям. Всего доброго!");
        System.exit(0);
    }

    private static int checkNumbers(Scanner input) {
        try {
            int x = Integer.parseInt(input.nextLine());
            if (x <= 0) {
                exit();
            }
            return x;
        } catch (NumberFormatException e) {
            exit();
            throw null;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое, положительное число:");
        int x = checkNumbers(input);

        System.out.println("Введите второе целое, положительное число:");
        int y = checkNumbers(input);

        System.out.println("НОК этих чисел = " + getGCD(x, y));
        System.out.println("НОД этих чисел = " + getLCM(x, y));

        input.close();
    }
}
