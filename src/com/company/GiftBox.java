package com.company;

class GiftBox implements IGiftBox {
    private int size;
    private Sweets[] gift = new Sweets[size];

    @Override
    public void insert(Sweets... sweets) {
        for (Sweets sw : sweets) {
            Sweets[] pre = gift;
            setSize(size + 1);
            gift = new Sweets[size];
            for (int i = 0; i < pre.length; i++)
                gift[i] = pre[i];
            gift[gift.length - 1] = sw;
        }
    }

    @Override
    public void delete(int index) {
        gift[index] = null;
        for (int i = 0; i < gift.length - 1; i++) {
            if (gift[i] == null) {
                gift[i] = gift[i + 1];
                gift[i + 1] = null;
            }
        }
        delete();
    }

    @Override
    public void delete() {
        if (gift.length > 0) {
            Sweets[] pre = gift;
            setSize(size - 1);
            gift = new Sweets[size];
            for (int i = 0; i < gift.length; i++)
                gift[i] = pre[i];
        }
    }

    @Override
    public void printWeigth() {
        int weight = 0;
        for (Sweets sweets : gift)
            weight += sweets.getWeight();
        System.out.println("GiftBox weight is " + weight);
    }

    @Override
    public void printPrice() {
        int price = 0;
        for (Sweets sweets : gift)
            price += sweets.getPrice();
        System.out.println("GiftBox price is " + price);
    }

    @Override
    public void printInfo() {
        for (Sweets sweets : gift) System.out.println(sweets);
    }

    public void setSize(int size) {
        this.size = size;
    }

}
