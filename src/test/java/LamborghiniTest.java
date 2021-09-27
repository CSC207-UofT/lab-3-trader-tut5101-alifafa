/*
 * This file contains sample tests for the class <Lamborghini>.
 */

import org.junit.*;
import static org.junit.Assert.*;

public class LamborghiniTest {
    Lamborghini Lamb;

    @Before
    public void setLamb() throws Exception {
        Lamb = new Lamborghini();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(10, Lamb.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        Lamb.upgradeSpeed();
        assertEquals(11, Lamb.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30, Lamb.getPrice());
    }
}
