package com.fibonachi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger array [] = new BigInteger[100];
        array[0] = BigInteger.valueOf(0);
        array[1] = BigInteger.valueOf(1);
        for (int i=2; i < array.length;i++){
            array[i] = array[i-1].add(array[i-2]);
        }
        while (true){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("=======Menu===================");
                System.out.println("1 - показать число в ячейке N");
                System.out.println("2 - показать сумму чисел");
                System.out.println("3 - выход");
                System.out.println("==============================");
                int decision = scanner.nextInt();
                switch (decision){
                    case 1: {
                        System.out.println("Введите позицию числа от 1 до 100");
                        int position = scanner.nextInt();
                        if ((position<1) || (position>100)){
                            System.out.println("Вы ввели значение за пределами диапазона");
                            System.out.println();
                        }else {
                            System.out.println(array[position-1]);
                        }
                    }break;
                    case 2: {
                        System.out.println("Введите сумму скольки чисел вывести на экран, введите число ль 1 до 100");
                        int count = scanner.nextInt();
                        if ((count<1) || (count>100)){
                            System.out.println("Вы ввели значение за пределами диапазона");
                            System.out.println();
                        }else {
                            BigInteger sum = BigInteger.valueOf(0);
                            for (int i =0; i < count+1; i++){
                                sum = sum.add(array[i]);
                            }
                            System.out.println(sum);
                        }

                    }break;
                    case 3:{
                        System.exit(0);
                    }break;
                    default:{
                        System.out.println("Такого пункта нет в меню");
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
                scanner.next();
            }


        }
    }


}
