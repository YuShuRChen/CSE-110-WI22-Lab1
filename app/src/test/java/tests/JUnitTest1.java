package tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitTest1 {

    @Test
    public void test1() {
        System.out.println("Hello World");
        assertEquals(2, 1 + 1);
    }
}
