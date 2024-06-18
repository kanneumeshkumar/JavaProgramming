package com.trainingmug.java.fundamentals;

public class TypeConversion {
    public static void main(String[] args) {

        byte age;
        age = 35;
        short ageValue;
        ageValue = age;
        System.out.println("AgeValue : " + ageValue);

        ageValue = 130;
        age = (byte) ageValue;
        System.out.println("Age : " + age);
        float value;
        value = 124.33143f;
        short values;
        values = (short)value;
        System.out.println("Values : " + values);
    }
}
