package com.company;

public class Main {

    public static void main(String[] args) {
        Hard hard = new Hard(50, 30);
        Storage storage = new Storage(12, "Operative");
        OS os = new OS("Windows", "10");
        Processor processor = new Processor("i5", 1.5, 2.3);
        Laptop laptop = new Laptop(200, "Hp", 12.0, hard, storage, os, processor);
        System.out.println(laptop);

    }


}
