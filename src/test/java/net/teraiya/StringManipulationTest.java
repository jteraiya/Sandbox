package net.teraiya;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringManipulationTest {

    @Test
    public void testIsUniquieChar() throws Exception {
        String str = "Th unique";
        int i = str.charAt(1);
        char c = str.charAt(1);
        System.out.println(i);
        System.out.println(c);
    }
}