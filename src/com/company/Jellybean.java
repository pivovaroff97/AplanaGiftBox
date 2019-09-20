package com.company;

class Jellybean extends Sweets {
    private String name;
    private int weight;
    private int price;
    private String size = "small";
        public Jellybean(String name, int weight, int price) {
            super(name, weight, price);
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Jellybean " +
                '\'' + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                ", size = '" + size + '\'';
    }
}
