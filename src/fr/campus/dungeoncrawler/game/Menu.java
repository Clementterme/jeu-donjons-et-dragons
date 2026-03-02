package fr.campus.dungeoncrawler.game;

import java.util.Scanner;

public class Menu {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (choix != 1 && choix != 2) {
            System.out.println("Menu :");
            System.out.println("1 - Nouveau personnage");
            System.out.println("2 - Quitter le jeu");
            System.out.print("Votre choix : ");

            // Vérification du type int
            if (sc.hasNextInt()) {
                choix = sc.nextInt();
            } else {
                System.out.println("Veuillez entrer un nombre valide !");
                sc.next();
                continue;
            }

            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi : Nouveau personnage");
                    break;
                case 2:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }

        sc.close();
    }
}
