package com.sparta.Enum_practice_Test;

import com.sparta.h_Enum_Practice.ArmyCreator;
import com.sparta.h_Enum_Practice.MedievalTroopType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArmyCreatorTest {

    @Test
    @DisplayName("Checking the displayBalance method works")
    public void displayBalanceTest() {
        ArmyCreator.balance = 1000;
        Assertions.assertEquals(1000 , ArmyCreator.displayBalance());
    }

    @Test
    @DisplayName("Checking checkCanAfford method returns true if user can afford the troops")
    public void canAfford() {
        Assertions.assertTrue(ArmyCreator.checkCanAfford(60, MedievalTroopType.ARCHER.getTroopCost()));
    }

    @Test
    @DisplayName("Checking checkCanAfford method returns false if user cannot afford the troops")
    public void cannotAfford() {
        Assertions.assertFalse(ArmyCreator.checkCanAfford(100, MedievalTroopType.KNIGHT.getTroopCost()));
    }


}
