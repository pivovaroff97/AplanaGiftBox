package com.company;

public class Main {

    public static void main(String[] args) {
        GiftBox giftBox = new GiftBox();
        giftBox.insert(new Candy("Ledenec", 100, 100, "tasty"));
        giftBox.insert(new Jellybean("Jellybean", 50, 50, "amazing"));
        giftBox.insert(new Chocolate("Alenka", 85, 60, "w/o sugar"));
        giftBox.printInfo();
        giftBox.printPrice();
        giftBox.printWeigth();
        giftBox.delete(0);
        giftBox.delete(1);
        giftBox.printInfo();
    }
}
    interface IGiftBox {
        void insert(Sweets sweets);
        void delete(int index);
        void delete();
        void printWeigth();
        void printPrice();
        void printInfo();
    }

    class GiftBox implements IGiftBox {
        private int size;
        private Sweets[] gift = new Sweets[size];

        @Override
        public void insert(Sweets sweets) {
            Sweets[] pre = gift;
            setSize(size + 1);
            gift = new Sweets[size];
            for (int i = 0; i < pre.length; i++)
                gift[i] = pre[i];
            gift[gift.length - 1] = sweets;
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
            Sweets[] pre = gift;
            setSize(size - 1);
            gift = new Sweets[size];
            for (int i = 0; i < gift.length; i++)
                gift[i] = pre[i];
            System.out.println(gift.length);
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
            for (Sweets sweets : gift) System.out.println("Name is " + sweets.getName()
            + ", Weight is " + sweets.getWeight() + ", Price is " + sweets.getPrice()
                    + ", Uniparam is " + sweets.getUniparam());
        }

        public void setSize(int size) {
            this.size = size;
        }

    }

    abstract class Sweets {
        private String name;
        private int weight;
        private int price;
        private String uniparam;

        public Sweets(String name, int weight, int price, String uniparam) {
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.uniparam = uniparam;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        public int getPrice() {
            return price;
        }

        public String getUniparam() {
            return uniparam;
        }
    }

    class Candy extends Sweets {
        public Candy(String name, int weight, int price, String uniparam) {
            super(name, weight, price, uniparam);
        }
    }

    class Jellybean extends Sweets {
        public Jellybean(String name, int weight, int price, String uniparam) {
            super(name, weight, price, uniparam);
        }
    }

    class Chocolate extends Sweets {
        public Chocolate(String name, int weight, int price, String uniparam) {
            super(name, weight, price, uniparam);
        }
    }
