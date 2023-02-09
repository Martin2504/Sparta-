package com.sparta.h_Enum_Practice;

import java.util.Scanner;

public class ArmyCreator {

    public static int balance = 1000;
    static int spearMenCount = 0;
    static int archerCount = 0;
    static int knightCount = 0;
    static int cavalryManCount = 0;
    static int swordManCount = 0;
    public static void createArmy() {
        ask();
    }

    public static void ask() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of troop would you like to train? : ");
        System.out.println("\t (1) SpearMen");
        System.out.println("\t (2) Archers");
        System.out.println("\t (3) Knights");
        System.out.println("\t (4) CavalryMen");
        System.out.println("\t (5) SwordsMen");
        int selectedTroop = scanner.nextInt();
        train(selectedTroop);

    }

    public static void train(int selectedTroop) {
        Scanner scanner = new Scanner(System.in);
        switch (selectedTroop) {
            case 1 :
                System.out.println("How many SpearMen would you like to train? ");
                int chosenSpearMenCount = scanner.nextInt();
                if (checkCanAfford(chosenSpearMenCount, MedievalTroopType.SPEARMAN.getTroopCost())) {
                    spearMenCount = spearMenCount + chosenSpearMenCount;
                    System.out.println("Trained " + chosenSpearMenCount + " SpearMen");
                    displayBalance();
                } else {
                    System.out.println("You cannot afford this...");
                    System.out.println("Balance : " + displayBalance());
                    question();
                }
                break;
            case 2 :
                System.out.println("How many Archers would you like to train? ");
                int chosenArcherCount = scanner.nextInt();
                if (checkCanAfford(chosenArcherCount, MedievalTroopType.ARCHER.getTroopCost())) {
                    archerCount = archerCount + chosenArcherCount;
                    System.out.println("Trained " + chosenArcherCount + " Archers");
                    displayBalance();
                } else {
                    System.out.println("You cannot afford this...");
                    System.out.println("Balance : " + displayBalance());
                    question();
                }
                break;
            case 3 :
                System.out.println("How many Knights would you like to train? ");
                int chosenKnightCount = scanner.nextInt();
                if (checkCanAfford(chosenKnightCount, MedievalTroopType.KNIGHT.getTroopCost())) {
                    knightCount = knightCount + chosenKnightCount;
                    System.out.println("Trained " + chosenKnightCount + " Knights");
                    displayBalance();
                } else {
                    System.out.println("You cannot afford this...");
                    System.out.println("Balance : " + displayBalance());
                    question();
                }
                break;
            case 4 :
                System.out.println("How many CavalryMen would you like to train? ");
                int chosenCavalryCount = scanner.nextInt();
                if (checkCanAfford(chosenCavalryCount, MedievalTroopType.CAVALRYMAN.getTroopCost())) {
                    cavalryManCount = cavalryManCount + chosenCavalryCount;
                    System.out.println("Trained " + chosenCavalryCount + " CavalryMen");
                    displayBalance();
                } else {
                    System.out.println("You cannot afford this...");
                    System.out.println("Balance : " + displayBalance());
                    question();
                }
                break;
            case 5 :
                System.out.println("How many SwordsMen would you like to train? ");
                int chosenSwordCount = scanner.nextInt();
                if (checkCanAfford(chosenSwordCount, MedievalTroopType.SWORDSMAN.getTroopCost())) {
                    swordManCount = swordManCount + chosenSwordCount;
                    System.out.println("Trained " + chosenSwordCount + " SwordsMen");
                    displayBalance();
                } else {
                    System.out.println("You cannot afford this...");
                    System.out.println("Balance : " + displayBalance());
                    question();
                }
                break;
            default :
                System.out.println("Invalid entry");
                ask();
        }
        question();
    }
    public static void question() {
        System.out.println("Do you want to: ");
        System.out.println("\t (1) Train more troops ");
        System.out.println("\t (2) Show my army overview ");
        System.out.println("\t (3) Show troop details ");
        System.out.println("\t (4) Exit ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            ask();
        } else if (choice == 2) {
            showArmy();
        } else if (choice == 3) {
            WelcomeMessage.displayWelcomeMessage();
        } else if (choice == 4) {
            System.exit(0);
        } else {
            System.out.println("Invalid choice...");
            question();
        }
    }

    public static int displayBalance() {
        return balance;
    }

    public static boolean checkCanAfford (int amount, int cost) {
        if (balance >= amount * cost) {
            balance = balance - (amount * cost);
            return true;
        } else {
            return false;
        }
    }

    public static void showArmy () {
        System.out.println("Army Overview: ");
        System.out.println("\t SpearMen count: " + spearMenCount);
        System.out.println("\t Archer count: " + archerCount);
        System.out.println("\t Knight count: " + knightCount);
        System.out.println("\t CavalryMan count: " + cavalryManCount);
        System.out.println("\t SwordMan count: " + swordManCount);
        question();
    }

}
