package com.example.testdemo1;

import android.util.Log;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);

        ArrayList<String> aa = new ArrayList<>();

        for(int i =0; i < 10000; i++){
            aa.add(i+"");
        }
        System.out.println( "===111111===");
        StringBuilder sb = new StringBuilder();
        for (String aSplit : aa) {
            sb.append(aSplit);
        }
        System.out.println();

    }




}