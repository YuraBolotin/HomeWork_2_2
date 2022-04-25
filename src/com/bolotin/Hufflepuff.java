package com.bolotin;

public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(String nameOfStudent, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(nameOfStudent, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;


    }
    @Override
    public String toString() {
        return "Студент факультета Пуффендуй: " + super.toString() + ", трудолюбие: " + hardWork + ", верность: " + loyalty +
                ", честность: " + honesty;
    }
}
