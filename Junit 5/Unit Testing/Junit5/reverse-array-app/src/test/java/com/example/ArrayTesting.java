package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayTesting{

    @Test
    void testArray(){
    int [] actual ={5,3,5};
    int [] expected ={5,3,5};

    assertArrayEquals(expected,actual);
    }

}