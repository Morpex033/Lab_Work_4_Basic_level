package com.company;


import java.util.ArrayList;

public class Laptops {
    private String Brand;

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    private int Video_memory;

    public void setVideo_memory(int video_memory) {
        Video_memory = video_memory;
    }

    public int getVideo_memory() {
        return Video_memory;
    }

    private int RAM;

    public void setRAM(int ram) {
        RAM = ram;
    }

    public int getRAM() {
        return RAM;
    }
    private boolean Touchscreen;

    public void setTouchscreen(boolean touchscreen) {
        Touchscreen = touchscreen;
    }

    public boolean getTouchscreen() {
        return Touchscreen;
    }
    private int Price;

    public void setPrice(int price) {
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public Laptops(String brand, int video_memory, int ram, boolean touchscreen, int price) {
        this.setBrand(brand);
        this.setVideo_memory(video_memory);
        this.setRAM(ram);
        this.setTouchscreen(touchscreen);
        this.setPrice(price);
    }

    public Laptops() {
        String[] brands = {"Lenovo", "Acer", "HP", "Dell", "Asus"};
        this.setBrand(brands[(int) (Math.random() * brands.length)]);
        int[] video_memory = {4, 8, 16, 32, 64};
        this.setVideo_memory(video_memory[(int) (Math.random() * video_memory.length)]);
        int[] ram = {2, 4, 8, 16, 32};
        this.setRAM(ram[(int) (Math.random() * ram.length)]);
        boolean[] touchscreen = {true, false};
        this.setTouchscreen(touchscreen[(int) (Math.random() * touchscreen.length)]);
        int[] price = {800, 1000, 1200, 1500, 1800};
        this.setPrice(price[(int) (Math.random() * price.length)]);
    }

    public void printInfo() {
        if (!this.getTouchscreen()) {
        System.out.println("\nBrand: " + getBrand());
        System.out.println("Video memory: " + getVideo_memory() + " GB");
        System.out.println("RAM: " + getRAM() + " GB");
        System.out.println("Touchscreen: " + getTouchscreen());
        System.out.println("Price: " + getPrice() + " $");
        }else{
            System.out.println("\nУ ноутбука " + this.getBrand() + " присутствует сенсорный экран");
        }
    }
}



