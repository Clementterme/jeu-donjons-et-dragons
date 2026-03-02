package fr.campus.dungeoncrawler.main;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu :");
            System.out.println("1 - Nouveau personnage");
            System.out.println("2 - Quitter le jeu");

            choix = sc.nextInt();

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
        } while (choix != 1 && choix != 2);

        sc.close();
    }
}
