import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
public class Tester {

    @Test
    public void testGetAmountOfLines(){
        CharCounter charCounter = new CharCounter();
        charCounter.addWords("hello");
        charCounter.addWords("World");
        charCounter.addWords("!");

        int actual = charCounter.getAmountOfLines();

        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmountOfChars(){
        CharCounter charCounter = new CharCounter();
        charCounter.addWords("hel lo");
        charCounter.addWords("Wor ld");

        int actual = charCounter.getAmountOfChars();

        int expected = 12;

        assertEquals(expected, actual);
    }
    @Test
    public void testAddWord(){
        CharCounter charCounter = new CharCounter();
        charCounter.addWords("Me");
        charCounter.addWords("You");
        charCounter.addWords("They");
        charCounter.addWords("Them");

        ArrayList<String> actual = charCounter.getWordArrayList();

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Me");
        expected.add("You");
        expected.add("They");
        expected.add("Them");

        assertEquals(expected, actual);
    }
}
