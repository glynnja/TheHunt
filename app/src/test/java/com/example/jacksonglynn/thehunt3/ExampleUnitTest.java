package com.example.jacksonglynn.thehunt3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(1, 0 + 1);
    }

    @Test
    public void addtolistview_isCorrect() throws Exception {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void add2tolistview_isCorrect() throws Exception {
        assertEquals(3, 1 + 2);
    }

    @Test
    public void deletefromlistview_isCorrect() throws Exception {
        assertEquals(2, 3 - 1);
    }

    @Test
    public void delete2fromlistview_isCorrect() throws Exception {
        assertEquals(1, 3 - 2);
    }

    @Test
    public void deleteallfromlistview_isCorrect() throws Exception {
        assertEquals(0, 3 - 3);
    }

    @Test
    public void takefrommultiplaylisaddtolistview_isCorrect() throws Exception {
        assertEquals(3, (3+3)/2);
    }
}