package com.java.study.lesson6.task1_enum_animals_and_override_to_string;

public enum Animals {
    DOG(10), CAT(2), HORSE(5), RABBIT(1);
    private int year;

    Animals(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Animal: " + super.toString() + " is " + this.year + " years.";
    }
}
