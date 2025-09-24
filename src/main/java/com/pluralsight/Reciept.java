package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {
        String itemname = "burgers";
        double itemprice = 5.55;
        int quantityitem = 4;
        double itemtotal = itemprice * 4;
        System.out.println("You bought" + " " + quantityitem + " " + itemname + " " + "for" + " " + "$" + itemtotal);
    }
}
