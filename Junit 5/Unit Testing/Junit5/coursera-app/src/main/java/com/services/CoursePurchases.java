package com.services;

import com.example.Course;///learn this import...this is an important import
import com.example.Java;

public class CoursePurchases {
    private Course course;//this course is instance veriable — a variable belonging to the object of CoursePurchases.
    public Boolean proceedWithCourse(Course course){//Course course = new Java();//this course is perimater veriable..belongs to this method only...as an local veriable.
        return course.coursePurchased();//based on which class object is passed that class object will be invocked
    }
}
