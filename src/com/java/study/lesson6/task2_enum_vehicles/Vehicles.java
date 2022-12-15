package com.java.study.lesson6.task2_enum_vehicles;

public enum Vehicles {
    BMW(10_000), MERCEDES(12_000), TOYOTA(9_400);
    private int price;
    private String color;
    Vehicles(int price){
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "Mark: " + super.toString() + ", price: " + this.price + ", color: " + getColor();
    }
}
