package com.skillup.classes;

public class Macbook extends Notebook{
    public Macbook(String system,String color,int diagonal) {
        this.sytem = system;
        this.color = color;
        this.diagonal = diagonal;

    }

    @Override
    String on() {
        return "welcome to macbook!";
    }
}
