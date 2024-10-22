package com.trainingmug.java.fundamentals;

public class ConditionalFormatting {
    public static void main(String[] args) {

        /* If member is Diamond 20% Gold 15% Silver 10% Others 5% */

        int productPrice;
        productPrice = 20000;
        int productDiscount;
        int discount;
        char member;
        member = 'H';
        if(member == 'D') {
            productDiscount = 20;
        } else if (member == 'G') {
            productDiscount = 15;
        } else if (member == 'S') {
            productDiscount = 10;
        } else {
            productDiscount = 5;
        }
        discount =  productPrice * productDiscount / 100;
        System.out.println("DiscoutPrice : " + discount);
        System.out.println("ProductPrice : " + (productPrice-discount));

    }
}
