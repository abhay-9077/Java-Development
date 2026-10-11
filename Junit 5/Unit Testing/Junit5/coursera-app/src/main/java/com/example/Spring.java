package com.example;

public class Spring implements Course {
    @Override
    public Boolean coursePurchased(){
        System.out.println("Spring course enrolled");
        System.out.println("Payment Pending");
        return false;
    }
}
