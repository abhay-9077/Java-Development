package com.example;

public class Junit implements Course {
    @Override
    public Boolean coursePurchased(){
        System.out.println("Junit course purchesed");
        return true;
    }
}

