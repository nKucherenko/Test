package com.skillup.classes;

public class Main {
    public static void main(String[] args) {
        Macbook pro13 = new Macbook("mac os","white",14);
        Asus vivo17 = new Asus("windows","black",15);

        System.out.println(pro13.on());
        System.out.println(vivo17.on());
        System.out.println(pro13.off());
        System.out.println(vivo17.off());

    }


}
