package factorial;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static BigInteger RecursionFactorial(int digit){
        BigInteger result = new BigInteger("1");
        if ((digit == 1) || (digit == 0)){
            return result;
        }
        result = BigInteger.valueOf(digit).multiply(RecursionFactorial(digit-1));
        return result;
    }

    static void Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите число для рассчета факториала");
        try {
            int digitForFactorial = scanner.nextInt();
            if (digitForFactorial < 0) {
                System.out.println("Факториал числа " + digitForFactorial + " = бесконечность");
            } else {
                System.out.println(RecursionFactorial(digitForFactorial));
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число ");
        }
    }

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("============Меню=============");
                System.out.println("1 - Рассчитать факторил");
                System.out.println("2 - Выход");
                System.out.println("=============================");
                System.out.println("Введите пункт меню");
                Scanner scannerForMenu = new Scanner(System.in);
                int userAnswer = scannerForMenu.nextInt();
                switch (userAnswer) {
                    case 1: {
                        Factorial();
                    }break;
                    case 2: {
                        System.exit(0);
                    }break;
                    default: {
                        System.out.println("Такого пункта нет в меню");
                        continue;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не корректное значение для меню");
            }


        }
    }
}

