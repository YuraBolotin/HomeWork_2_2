package com.bolotin;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int leadership;

    public Slytherin(String nameOfStudent, int magicPower, int transgressionDistance, int cunning, int determination,
                     int ambition, int resourcefulness, int leadership) {
        super(nameOfStudent, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.leadership = leadership;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    @Override
    public String toString() {
        return "Студент факультета Слизерин: " + super.toString() + ", хитрость: " + cunning + ", решительность: " + determination +
                ", амбициозность: " + ambition + ", находчивость: " + resourcefulness + ", жажда власти: " + leadership;
    }
}
