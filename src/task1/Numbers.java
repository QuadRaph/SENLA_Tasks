package task1;

import java.math.BigInteger;
import java.util.Scanner;

//Создать программу, которая будет сообщать, является ли целое число, введенное пользователем,
//чётным или нечётным, простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.

public class Numbers {

    public static String oddOrEven(int x) {
        return (x % 2 == 0) ? "чётное." : "нечётное.";
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое число:");
        try {
            int x = Integer.parseInt(input.nextLine());
            switch (x) {
                case 0:
                    System.out.println("Число ноль не соответствет критерию ввода (оно не является целым). До встречи!");
                    break;
                case 1:
                    System.out.println("Вы ввели 1 - это число нечётное. Его нельзя отнести ни к простым, ни к составным числам.");
                    break;
                case 2:
                    System.out.println("Простое, чётное.");
                    break;
                default:
                    if (x < 0) System.out.println("Отрицательное, " + oddOrEven(x));
                    else if (BigInteger.valueOf(x).isProbablePrime(100)) {
                        System.out.println("Простое, нечётное.");
                    } else {
                        System.out.print("Составное, " + oddOrEven(x));
                    }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Ввод не соответствует критерию. Всего доброго!");
            System.exit(0);
        }

        input.close();
    }
}
