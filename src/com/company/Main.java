package com.company;

import java.util.*;

public class Main {

    private static Math RandomStringUtils;

    public static <numbersArray> void main(String[] args) {
        // write your code here
        System.out.println("1. Приветствовать любого пользователя при вводе его имени через командную строку.");
        System.out.println("Enter your name" + "\n");
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.next();
        System.out.println("Hello " + nameUser);

        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        System.out.println("Enter data to reverse");
        Scanner scanner2 = new Scanner(System.in);
        String reverseData = scanner2.next();
        StringBuilder dataReverse = new StringBuilder(reverseData);
        System.out.println("reverse data " + dataReverse.reverse().toString());

        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.");
        System.out.println("Input random number < 100");
        int randomNumber;
        randomNumber = scanner.nextInt();
        Random random = new Random();
        int[] arrayNumbers = new int[randomNumber];
        for (int i = 0; i<randomNumber; i++){
            arrayNumbers[i] = ((int)(Math.random() * 100));
            System.out.print(arrayNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i<randomNumber; i++){
            System.out.println(arrayNumbers[i] + " ");
        }

        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        String passTemplate = "passTrue";
        System.out.println("Input template password");
        Scanner passScanInput = new Scanner(System.in);
        String passInput = passScanInput.next();
        if (passTemplate.equals(passInput)){
            System.out.println("They are equal");
        } else {
            System.out.println("Wrong password");
        }

        System.out.println("5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и вывести результат на консоль.");
        System.out.println("Input first integer number");
        Scanner numbInput = new Scanner(System.in);
        int numb1 = numbInput.nextInt();
        System.out.println("Input Second integer number");
        Scanner numbInput2 = new Scanner(System.in);
        int numb2 = numbInput2.nextInt();
        int sum2 = numb1 + numb2;
        int mult2 = numb1 * numb2;
        System.out.println("sum numbers = " + sum2);
        System.out.println("multiply numbers = " + mult2);

        System.out.println("6. Ввести с консоли n целых чисел. На консоль вывести:6.1. Четные и нечетные числа. 6.2. Наибольшее и наименьшее число. 6.3. Числа, которые делятся на 3 или на 9. 6.4. Числа, которые делятся на 5 и на 7. 6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых\n" +
                "цифр. 6.6. «Счастливые» числа.   ");
        System.out.println("Input length array");
        Scanner lengthScan = new Scanner(System.in);
        int lengNum = lengthScan.nextInt();
        Integer [] sourceNumbersArray = new Integer[lengNum];
        System.out.print("Input numbers to array");
        for (int i = 0; i<lengNum; i++){
            Scanner numInp = new Scanner(System.in);
            sourceNumbersArray[i]= numInp.nextInt();
        }
        for (int i = 0; i<lengNum; i++){
            if (sourceNumbersArray[i]% 2 == 0) {
                System.out.println("even number " + sourceNumbersArray[i]);
            }else {
                System.out.println("odd number " + sourceNumbersArray[i]);
            }
        }
        System.out.println("Minimum number of array is : " + Collections.min(Arrays.asList(sourceNumbersArray)));
        System.out.println("Maximum number of array is : " + Collections.max(Arrays.asList(sourceNumbersArray)));
        for (int i = 0; i<lengNum; i++){
            if ((sourceNumbersArray[i]% 3 == 0) || (sourceNumbersArray[i]% 9 == 0)) {
                System.out.println("number divisible by 3 or 9 this " + sourceNumbersArray[i]);
            }
        }
        for (int i = 0; i<lengNum; i++){
            if ((sourceNumbersArray[i]% 5 == 0) && (sourceNumbersArray[i]% 7 == 0)) {
                System.out.println("number divisible by 5 and 7 this " + sourceNumbersArray[i]);
            }
        }

        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.

        Integer[] numbersArray = new Integer[10000];

        for (int i = 100; i<1000; i++){
            numbersArray[i-100] = i;
            String number3Lenhgt = numbersArray[i-100].toString();
            if (number3Lenhgt.charAt(0)!=number3Lenhgt.charAt(1) && number3Lenhgt.charAt(0)!=number3Lenhgt.charAt(2)&&number3Lenhgt.charAt(1)!=number3Lenhgt.charAt(2)){
                System.out.println("Unique numbers  this length 3 = " + number3Lenhgt);
            }
        }
//6.6 «Счастливые» числа.

        for (int i = 1000; i<10000; i++){
            numbersArray[i-1000] = i;
            String number4Lenhgt = numbersArray[i-1000].toString();
            if (number4Lenhgt.charAt(0)+ number4Lenhgt.charAt(1) == number4Lenhgt.charAt(2)+number4Lenhgt.charAt(3)){
                System.out.println("Lucky  numbers = " + number4Lenhgt);
            }
        }







    }
// сортировка только четные
/* IntStream.range(1,100)
         .filter((a1)->a1%2==0)
            .forEach(System.out::println);*/




}
