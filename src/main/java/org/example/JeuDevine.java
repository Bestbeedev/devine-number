package org.example;

// JeuDevine.java
import java.util.Scanner;

public class JeuDevine {
    private int nombreSecret;
    private int maxEssais;

    public JeuDevine(int maxEssais) {
        this.nombreSecret = (int)(Math.random() * 100) + 1;  // Nombre entre 1 et 100
        this.maxEssais = maxEssais;
    }

    public void jouer() {
        Scanner scanner = new Scanner(System.in);
        int essais = 0;
        boolean trouve = false;

        System.out.println("Bienvenue dans le jeu 'Devine le Nombre' !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Devine-le !");

        while (essais < maxEssais && !trouve) {
            System.out.print("Essai " + (essais + 1) + ": ");
            int proposition = scanner.nextInt();
            essais++;

            if (proposition == nombreSecret) {
                trouve = true;
                System.out.println("Bravo ! Tu as trouvé le nombre en " + essais + " essais.");
            } else if (proposition < nombreSecret) {
                System.out.println("C'est plus grand !");
            } else {
                System.out.println("C'est plus petit !");
            }
        }

        if (!trouve) {
            System.out.println("Dommage ! Le nombre était : " + nombreSecret);
        }
    }
}
