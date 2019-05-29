package com.epita.socra.app;

import com.epita.socra.app.tools.Morseconverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class morseTest {
    @Test
    public void given10thenreturn1pointand9underscore()
    {
        Morseconverter mc = new Morseconverter();
        String result = mc.toMorse(10);
        assertEquals(". _ _ _ _ _ _ _ _ _", result);
    }
    @Test
    public void given42thenreturn4points1underscore2pointsand3underscores()
    {
        Morseconverter mc = new Morseconverter();
        String result = mc.toMorse(42);
        assertEquals(". . . . _ . . _ _ _", result);
    }
    @Test
    public void given83thenreturn3underscores5pointsand2underscores()
    {
        Morseconverter mc = new Morseconverter();
        String result = mc.toMorse(83);
        assertEquals("_ _ _ . . . . . _ _", result);
    }
    @Test
    public void given999thenreturn4underscores1point4underscores1point4underscores1point()
    {
        Morseconverter mc = new Morseconverter();
        String result = mc.toMorse(999);
        assertEquals("_ _ _ _ . _ _ _ _ . _ _ _ _ .", result);
    }
    @Test
    public void given1903thenreturn1point8underscores1point5underscores3points2underscores() {
        Morseconverter mc = new Morseconverter();
        String result = mc.toMorse(1903);
        assertEquals(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _", result);
    }
    @Test
    public void givenStringReturn10() {
        Morseconverter mc = new Morseconverter();
        int result = mc.toValue(". _ _ _ _ _ _ _ _ _");
        assertEquals(10, result);
    }
    @Test
    public void givenStringReturn42() {
        Morseconverter mc = new Morseconverter();
        int result = mc.toValue(". . . . _ . . _ _ _");
        assertEquals(42, result);
    }
    @Test
    public void givenStringReturn83() {
        Morseconverter mc = new Morseconverter();
        int result = mc.toValue("_ _ _ . . . . . _ _");
        assertEquals(83, result);
    }
    @Test
    public void givenStringReturn999() {
        Morseconverter mc = new Morseconverter();
        int result = mc.toValue("_ _ _ _ . _ _ _ _ . _ _ _ _ .");
        assertEquals(999, result);
    }
    @Test
    public void givenStringReturn1903() {
        Morseconverter mc = new Morseconverter();
        int result = mc.toValue(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _");
        assertEquals(1903, result);
    }
}
