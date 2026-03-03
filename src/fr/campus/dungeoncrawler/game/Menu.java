package fr.campus.dungeoncrawler.game;

import fr.campus.dungeoncrawler.character.Character;
import fr.campus.dungeoncrawler.character.Warrior;
import fr.campus.dungeoncrawler.character.Wizard;

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
                    characterCreation();
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

    public static void characterCreation() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;

//        while (choix != 1 && choix != 2) {}
        System.out.println("Vous avez choisi : Nouveau personnage");
        System.out.println("Choisissez une classe :");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Magicien");
        System.out.print("Votre choix : ");

        // Vérification du type int
        if (sc.hasNextInt()) {
            choix = sc.nextInt();
        } else {
            System.out.println("Veuillez entrer un nombre valide !");
            sc.next();
//            continue;
        }

        String character = "";

        if (choix == 1) {
            character = "Guerrier";
        } else if (choix == 2) {
            character = "Magicien";
        }

        System.out.print("Nom de votre personnage : ");
        String name = sc.next();

        Character player = null;

        if (character.equals("Guerrier")) {
            player = new Warrior(name);
        } else if (character.equals("Magicien")) {
            player = new Wizard(name);
        }

        player.displayStats();

        choix = 0;

        System.out.println(player.getName() + " a été crée avec succès !");
        System.out.println("1 - Voir les informations de " + name);
        System.out.println("2 - Modifier les informations de " + name);
        System.out.println("3 - Retour au menu principal");
        System.out.print("Votre choix : ");

        // Vérification du type int
        if (sc.hasNextInt()) {
            choix = sc.nextInt();
        } else {
            System.out.println("Veuillez entrer un nombre valide !");
            sc.next();
//            continue;
        }

        switch (choix) {
            case 1:
                System.out.println("Informations de " + name + " :");
                break;
            case 2:
                System.out.print("Choisissez un nouveau nom : ");
                break;
            case 3:
                main();
                break;
            default:
                System.out.println("Choix invalide");
        }
    }
}
