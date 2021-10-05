package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int value = 50;
        int bottom = 0;
        int top = 100;

        while(true) {
            System.out.println("is number more than " + value + "? > - more < - less.");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            if (line.equals(">")) {
                bottom = value;
                value = bottom + (top - bottom) / 2;
            } else if (line.equals("<")) {
                top = value;
                value = bottom + (top - bottom) / 2;
            }

            if ((top - bottom) == 1) {
                value = bottom + 1;
                break;
            }
        }
        System.out.println("your number is: " + value);

    }
}
