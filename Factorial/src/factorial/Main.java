package factorial;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число для рассчета факториала");
        try {
            int digitForFactorial = scanner.nextInt();
            if (digitForFactorial < 0) {
                System.out.println("Факториал числа " + digitForFactorial + " = бесконечность");
            } else {
                BigInteger result = new BigInteger("1");
                for (int i = digitForFactorial; i > 0; i--) {
                    result = result.multiply(new BigInteger(String.valueOf(i)));
                }
                System.out.println("Факториал числа " + digitForFactorial + " = " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число ");
        }
    }
}

