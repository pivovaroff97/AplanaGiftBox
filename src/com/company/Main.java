package com.company;

public class Main {

    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox();
        Candy crocunt = new Candy("Crocunt", 60, 70);
        Candy chiorio = new Candy("Chio-Rio", 100, 120);
        Candy barboris = new Candy("Barboris", 140, 160);
        crocunt.setCountOfCandies(30);
        chiorio.setCountOfCandies(50);
        barboris.setCountOfCandies(70);
        Jellybean smallJelly = new Jellybean("Jellybean_small", 50, 30);
        Jellybean midJelly = new Jellybean("Jellybean_mid", 150, 90);
        Jellybean bigJelly = new Jellybean("Jellybean_big", 300, 150);
        smallJelly.setSize("small");
        midJelly.setSize("mid");
        bigJelly.setSize("big");
        Chocolate whiteChocolate = new Chocolate("White", 85, 60);
        Chocolate milkChocolate = new Chocolate("Milk", 85, 60);
        Chocolate bitterChocolate = new Chocolate("Bitter", 85, 60);
        whiteChocolate.setColor("white");
        milkChocolate.setColor("brown");
        bitterChocolate.setColor("black");
        giftBox.insert(crocunt, chiorio, barboris, smallJelly, midJelly, bigJelly,
                whiteChocolate, milkChocolate, bitterChocolate);
        giftBox.printInfo();
        giftBox.printPrice();
        giftBox.printWeigth();
        giftBox.delete(0);
        giftBox.delete(1);
        giftBox.delete();
        giftBox.delete();
        giftBox.delete();
        giftBox.printInfo();
    }
}

