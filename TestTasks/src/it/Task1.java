package com.it;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    private static Object RandomStringUtils;

    public static void main(String[] args) {
        System.out.println("Enter your name" + "\n");
        Scanner scanner = new Scanner(System.in);
        String nameUser = scanner.next();
        System.out.println("Hello " + nameUser);

        System.out.println("Enter data to reverse");
        Scanner scanner2 = new Scanner(System.in);
        String reverseData = scanner2.next();
        StringBuilder dataReverse = new StringBuilder(reverseData);
        System.out.println("reverse data " + dataReverse.reverse().toString());


        Integer randomNumber;



    }


}
