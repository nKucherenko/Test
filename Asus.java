package com.skillup.classes;

public class Asus extends Notebook{
    public Asus(String system,String color,int diagonal) {
        this.sytem = system;
        this.color = color;
        this.diagonal = diagonal;
    }

    @Override
    String off() {
        return "goodbye!";
    }
}
