package com.sparta.OOP_Task;


import com.sparta.d_OOP_Task.Lion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OOP_LionTest {

    @Test
    @DisplayName("Calling the eat method with no prarmaters")
    public void noParamCall() {
        Lion LionTest = new Lion(4, "Forest");
        String expected = "Lion ate";
        String result = LionTest.eat();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Calling the eat method with food passed")
    public void foodCall() {
        Lion LionTest = new Lion(4, "Forest");
        String expected = "Lion ate meat";
        String result = LionTest.eat("meat");
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing the constructor works")
    public void habitatTest() {
        Lion LionTest = new Lion(4, "Forest");
        String expected = "Forest";
        String result = LionTest.getHabitat();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing the Lion's inheritance from Animal works")
    public void inheritanceTest() {
        Lion LionTest = new Lion(4, "Forest");
        boolean expected = true;
        boolean result = LionTest.hasTail();
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing Lion had implemented Interface CanRoar's method")
    public void roarTest() {
        Lion LionTest = new Lion(4, "Forest");
        String expected = "Lion had roared";
        String result = LionTest.roar();
        Assertions.assertEquals(expected, result);
    }

}
