package com.bolotin;

public class Hogwarts {
    private String nameOfStudent;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String nameOfStudent, int magicPower, int transgressionDistance) {
        this.nameOfStudent = nameOfStudent;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }


    @Override
    public String toString() {
        return    this.nameOfStudent +
                ", сила магии: " + magicPower +
                ", расстояние трансгрессии: " + transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;




    }
}
