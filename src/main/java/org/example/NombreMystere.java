package org.example;


import java.util.Scanner;
import java.util.Random;

public class NombreMystere {
    public static void main(String[] args) {
        Random rand = new Random();
        int nombreMystere = rand.nextInt(100) + 1; // Entre 1 et 100
        int tentative;
        Scanner scanner = new Scanner(System.in);

        System.out.println("🎮 Bienvenue dans le jeu du Nombre Mystère !");
        System.out.println("Devinez le nombre entre 1 et 100 :");

        do {
            System.out.print("Entrez votre proposition : ");
            tentative = scanner.nextInt();

            if (tentative < nombreMystere) {
                System.out.println("🔺 C'est plus grand !");
            } else if (tentative > nombreMystere) {
                System.out.println("🔻 C'est plus petit !");
            } else {
                System.out.println("🎉 Bravo, vous avez trouvé le nombre mystère : " + nombreMystere);
            }
        } while (tentative != nombreMystere);

        scanner.close();
    }
}

