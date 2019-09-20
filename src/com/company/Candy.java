package com.company;

class Candy extends Sweets {
    private String name;
    private int weight;
    private int price;
    private int countOfCandies = 30;
    public Candy(String name, int weight, int price) {
        super(name, weight, price);
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void setCountOfCandies(int countOfCandies) {
        this.countOfCandies = countOfCandies;
    }

    @Override
    public String toString() {
        return "Candy " +
                '\'' + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                ", countOfCandies = " + countOfCandies;
    }
}
