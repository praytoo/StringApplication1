package com.pluralsight;

import java.util.Scanner;

public class InputExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your favorite animal?");
        String animal = scanner.nextLine();
        System.out.println("What's the first tool that comes to mind?");
        String tool = scanner.nextLine();
        System.out.println("What day were you born?");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.printf("%s + %s + %d", animal, tool, day);
    }
}
