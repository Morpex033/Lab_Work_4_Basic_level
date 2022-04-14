package com.company;

import java.util.ArrayList;

public class Main  {

    public static void main(String[] args) {
        Laptops laptops = new Laptops("Asus",4,8,false,800);
        Laptops laptops1 = new Laptops("HP",4,16,true,1000);
        Laptops laptops2 = new Laptops();
        Laptops laptops3 = new Laptops();

        laptops.printInfo();
        laptops1.printInfo();
        laptops2.printInfo();
        laptops3.printInfo();

    }
}
