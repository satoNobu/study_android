package com.example.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator mCalculator;
    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() {
        //予想：1 + 5 で 6が返ってくるはず
        assertEquals(6, mCalculator.sum(1, 5), 0);
    }

    @Test
    public void substract() {
        // 現状のsubstractメソッドだと失敗する
        assertEquals(2, mCalculator.substract(5, 3), 0);
    }
}