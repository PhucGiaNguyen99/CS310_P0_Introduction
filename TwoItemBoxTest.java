import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class TwoItemBoxTest {
    // Create an object of class TwoItemBox with String for item 1 and Integer for item 2
    // Test the first item of the box
    @org.junit.jupiter.api.Test
    void getItem1() {
        TwoItemBox<String, Integer> box1 = new TwoItemBox<>("Hello world", 13);
        assertEquals("Hello world", box1.getItem1());
    }

    // Test the second item of the box
    @org.junit.jupiter.api.Test
    void getItem2() {
        TwoItemBox<String, Integer> box2 = new TwoItemBox<>("Hello world", 13);
        assertEquals(13, box2.getItem2().intValue());
    }
}