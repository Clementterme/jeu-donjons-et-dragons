package fr.campus.dungeoncrawler.game;

import fr.campus.dungeoncrawler.character.Character;
import fr.campus.dungeoncrawler.character.Warrior;
import fr.campus.dungeoncrawler.character.Wizard;

import java.util.Scanner;

public class Menu {

    public Character mainMenu() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        Character player = null;

        while (true) {
            System.out.println("Menu :");
            System.out.println("1 - Commencer la partie");
            System.out.println("2 - Nouveau personnage");
            System.out.println("3 - Quitter le jeu");
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
                    if (player == null) {
                        System.out.println("Vous devez créer un personnage avant de commencer !");
                        break;
                    } else {
                        System.out.println("La partie commence !");
                        return player;
                    }
                case 2:
                    player = characterCreation();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    // Pour mettre fin au programme
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }

    public Character characterCreation() {
        Scanner sc = new Scanner(System.in);
        int choix = 0;

        while (choix != 1 && choix != 2) {
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
                continue;
            }

            if (choix != 1 && choix != 2) {
                System.out.println("Choix invalide");
            }
        }

            System.out.print("Nom de votre personnage : ");
            String name = sc.next();

            Character player;

            if (choix == 1) {
                player = new Warrior(name);
            } else {
                player = new Wizard(name);
            }

            System.out.println(player.getName() + " a été crée avec succès !");

            choix = 0;

        while (choix != 3) {
            System.out.println("1 - Voir les informations de " + player.getName());
            System.out.println("2 - Modifier les informations de " + player.getName());
            System.out.println("3 - Retour au menu principal");
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
                    player.displayStats();
                    break;
                case 2:
                    System.out.print("Choisissez un nouveau nom : ");
                    String newName = sc.next();
                    player.setName(newName);
                    System.out.println("Votre nouveau nom est " + newName);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
        return player;
    }
}
