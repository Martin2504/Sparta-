package com.sparta.d_OOP_Task;

public class Lion extends Animal implements CanRoar {
    private int maneLength;
    private String habitat;

    public String getHabitat() {
            return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Lion(int maneLength, String habitat) {
        this.maneLength = maneLength;
        this.habitat = habitat;
    }

    @Override
    public boolean hasTail() {
        return true;
    }

    public String eat() {
        return "Lion ate";
    }

    public String eat(String food) {
        return "Lion ate " + food;
    }
}
