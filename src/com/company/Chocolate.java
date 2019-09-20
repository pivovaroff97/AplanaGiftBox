package com.company;

class Chocolate extends Sweets {
    private String name;
    private int weight;
    private int price;
    private String color = "milk";
    public Chocolate(String name, int weight, int price) {
        super(name, weight, price);
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate " +
                '\'' + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                ", color = '" + color + '\'';
    }
}
