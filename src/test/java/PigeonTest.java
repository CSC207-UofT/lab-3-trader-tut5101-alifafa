import org.junit.Before;
import org.junit.Test;

import org.junit.*;

import static org.junit.Assert.*;

public class PigeonTest {
    Pigeon p;

    @Before
    public void setUp() throws Exception {
        p = new Pigeon(0.5);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("woo", p.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(2, p.getPrice());
    }


}