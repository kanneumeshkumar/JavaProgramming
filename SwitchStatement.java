package com.trainingmug.java.fundamentals;

public class SwitchStatement {
    public static void main(String[] args) {
        String brand = "nokia";
        int productPrice;
       productPrice = 30000;
        int productDiscount = 1;
        int discount;
        char member = 'G';
        switch (brand){
            case "samsung":
                if(member == 'D')
                    productDiscount = 20;
                else if(member == 'G')
                    productDiscount = 15;
                else if (member == 'S')
                    productDiscount = 10;
                else
                    productDiscount = 5;
                break;
            case "nokia":
                if(member == 'D')
                    productDiscount = 30;
                else if(member == 'G')
                    productDiscount = 25;
                else if (member == 'S')
                    productDiscount = 20;
                else
                    productDiscount = 10;
                break;
            default:
                productDiscount = 10;
        }
        discount = productPrice * productDiscount / 100;
       System.out.println("Discont : " + discount);
        System.out.println("ProductPrice : " + (productPrice-discount));
    }
}
