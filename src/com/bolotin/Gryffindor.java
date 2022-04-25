package com.bolotin;

public class Gryffindor extends Hogwarts {
    private int chivalry;
    private int honor;
    private int bravery;

    public Gryffindor(String nameOfStudent, int magicPower, int transgressionDistance, int chivalry, int honor, int bravery) {
        super(nameOfStudent, magicPower, transgressionDistance);
        this.chivalry = chivalry;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getChivalry() {
        return chivalry;
    }

    public void setChivalry(int chivalry) {
        this.chivalry = chivalry;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Студент факультета Гриффиндор: " + super.toString() + ", благородство: " + chivalry + ", честь: " + honor +
                ", храбрость: " + bravery;
    }
}
