package hot_cold;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random_digit = (int) (Math.random()*100);
        int user_digit = 0;
        while (random_digit-user_digit!=0){
            try {
                System.out.println("Введите целое число от 1 до 100");
                user_digit = scanner.nextInt();
                if (user_digit<=0) {
                    System.out.println("Значение = 0 или меньше 0");
                }else {
                    int result = Math.abs(random_digit - user_digit);
                    if (result == 0) {
                        System.out.println("Ты победил");
                    } else if ((result > 0) && (result <= 10)) {
                        System.out.println("Горячо");
                    } else if ((result > 10) && (result <= 25)) {
                        System.out.println("Тепло");
                    } else if ((result > 25) && (result <= 50)) {
                        System.out.println("Холодно");
                    } else if ((result > 50) && (result <= 100)) {
                        System.out.println("Очень холодно");
                    } else System.out.println("Вы ввели число больше 100");
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
                scanner.next();
            }
        }
    }
}
