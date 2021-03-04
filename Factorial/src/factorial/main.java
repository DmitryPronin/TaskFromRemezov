package factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедите число для рассчета факториала");
        try {
            int digitForFactorial = scanner.nextInt();
            if (digitForFactorial < 0) {
                System.out.println("Факториал числа " + digitForFactorial + " = бесконечность");
            } else {
                long result = 1;
                for (int i = digitForFactorial; i > 0; i--) {
                    result = result * i;
                }
                System.out.println("Факториал числа " + digitForFactorial + " = " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
        }
    }
}

