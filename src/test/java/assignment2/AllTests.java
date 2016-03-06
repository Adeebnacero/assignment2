package assignment2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test for simple Addition.
 */
public class AllTests
{
    @Test
    private void testAdditionPass()
    {
        Addition a1 = new Addition();

        int expected = 9;
        int result = a1.addition(5,4);
        assertEquals(expected,result);
    }
    @Test
    private void testAdditionFail()
    {
        Addition a2 = new Addition();

        int expected = 10;
        int result = a2.addition(5,4);
        assertEquals(expected,result);
    }
    @Test
private void testStringNotNullPass()
{
    Nullness a3 = new Nullness();

    String result = a3.word("Hello");
    assertNotNull("Will pass as string is present",result);
}
    @Test
    private void testStringNotNullFail()
    {
        Nullness a4 = new Nullness();

        String result = a4.word(null);
        assertNotNull(result);
    }
    @Test
    private void testStringNullPass()
    {
        Nullness a5 = new Nullness();

        String result = a5.word(null);
        String expected = null;
        assertNull(expected,result);
    }
    @Test
    private void testStringNullFail()
    {
        Nullness a6 = new Nullness();

        String result = a6.word(null);
        String expected = "Aloha";
        assertNull(expected,result);
    }
    @Test
    public void testFloatPass()
    {
        Float a7 = new Float();

        double result = a7.testFloat(5.00);
        double expected = 5.00;

        assertEquals(expected,result,0.01);
    }
    @Test
    public void testFloatFails()
    {
        Float a8 = new Float();

        double result = a8.testFloat(5.00);
        int expected = 5;

        assertEquals(expected,result,0.01);
    }
    @Test
    public void testAmountPass()
    {
        Equality a9 = new Equality();

        String result = a9.objectsEqual("Yes");
        String expected = "Yes";

        assertSame(expected,result);
    }
    @Test
    public void testAmountFail()
    {
        Equality a9 = new Equality();

        String result = a9.objectsEqual("Yes");
        String expected = "No";

        assertNotSame(expected,result);
    }

}