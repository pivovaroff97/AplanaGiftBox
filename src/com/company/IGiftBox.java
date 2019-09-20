package com.company;

interface IGiftBox {
    void insert(Sweets... sweets);
    void delete(int index);
    void delete();
    void printWeigth();
    void printPrice();
    void printInfo();
}
