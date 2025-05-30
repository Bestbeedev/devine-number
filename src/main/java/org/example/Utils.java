package org.example;

import java.util.Scanner;

public class Utils {
    public static int lireEntier(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void afficherMessage(String message) {
        System.out.println(message);
    }
}
