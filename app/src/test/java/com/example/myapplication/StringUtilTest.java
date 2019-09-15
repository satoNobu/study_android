package com.example.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    private StringUtil mStringUtil;
    @Before
    public void setUp() throws Exception {
        mStringUtil = new StringUtil();
    }

    @Test
    public void isEmpty() {
        assertEquals(true, mStringUtil.isEmpty(""));
    }
}