package com.sparta.h_Enum_Practice;

public enum MedievalTroopType {

    // Use Case : Client wants a battle game developed in which the user can create an army.
    // This requires types of medieval troops.

    SPEARMAN (73, 80, 10),
    ARCHER (42, 50, 7),
    KNIGHT (85, 95, 12),
    CAVALRYMAN (80, 75, 11),
    SWORDSMAN (78, 90, 10);

    private int troopStrength;
    private int troopHealth;
    private int troopCost;

    MedievalTroopType(int troopStrength, int troopHealth, int troopCost) {
        this.troopStrength = troopStrength;
        this.troopHealth = troopHealth;
        this.troopCost = troopCost;
    }



    public void setTroopStrength(int troopStrength) {
        this.troopStrength = troopStrength;
    }

    public int getTroopHealth() {
        return troopHealth;
    }

    public void setTroopHealth(int troopHealth) {
        this.troopHealth = troopHealth;
    }

    public int getTroopCost() {
        return troopCost;
    }

    public void setTroopCost(int troopCost) {
        this.troopCost = troopCost;
    }

    public int getTroopStrength() {
        return troopStrength;
    }

}
