package com.sparta.h_Enum_Practice;

public class WelcomeMessage {
    public static void displayWelcomeMessage() {
        System.out.println("You have a balance of " + ArmyCreator.balance + " gold coins!");
        System.out.println("Here are the troop details: ");
        System.out.println();
        System.out.println("SpearMan: " );
        System.out.println("Strength: " + MedievalTroopType.SPEARMAN.getTroopStrength() +
                " || Health: " + MedievalTroopType.SPEARMAN.getTroopHealth() +
                " || Cost: " + + MedievalTroopType.SPEARMAN.getTroopCost());
        System.out.println("Archer: " );
        System.out.println("Strength: " + MedievalTroopType.ARCHER.getTroopStrength() +
                " || Health: " + MedievalTroopType.ARCHER.getTroopHealth() +
                " || Cost: " + + MedievalTroopType.ARCHER.getTroopCost());
        System.out.println("Knight: " );
        System.out.println("Strength: " + MedievalTroopType.KNIGHT.getTroopStrength() +
                " || Health: " + MedievalTroopType.KNIGHT.getTroopHealth() +
                " || Cost: " + + MedievalTroopType.KNIGHT.getTroopCost());
        System.out.println("CavalryMan: " );
        System.out.println("Strength: " + MedievalTroopType.CAVALRYMAN.getTroopStrength() +
                " || Health: " + MedievalTroopType.CAVALRYMAN.getTroopHealth() +
                " || Cost: " + + MedievalTroopType.CAVALRYMAN.getTroopCost());
        System.out.println("SwordsMan: " );
        System.out.println("Strength: " + MedievalTroopType.SWORDSMAN.getTroopStrength() +
                " || Health: " + MedievalTroopType.SWORDSMAN.getTroopHealth() +
                " || Cost: " + + MedievalTroopType.SWORDSMAN.getTroopCost());
        System.out.println();
        ArmyCreator.createArmy();
    }
}
