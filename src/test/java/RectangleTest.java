import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private static final Integer WIDTH_FIRST = 300;
    private static final Integer LENGTH_FIRST = 400;
    private static final String COLOR_FIRST = "red";

    private static final Integer WIDTH_SECOND = 300;
    private static final Integer LENGTH_SECOND = 400;
    private static final String COLOR_SECOND = "red";

    @Test
    public void equalsOfRectangleOk() {
        Rectangle firstRectangle = new Rectangle(WIDTH_FIRST, LENGTH_FIRST, COLOR_FIRST);
        Rectangle secondRectangle = new Rectangle(WIDTH_SECOND, LENGTH_SECOND, COLOR_SECOND);

        Assert.assertTrue("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode()
                        + " and equals " + firstRectangle.equals(secondRectangle),
                firstRectangle.equals(secondRectangle));
    }

    @Test
    public void hashcodeOfRectanglesOK() {
        Rectangle firstRectangle = new Rectangle(WIDTH_FIRST, LENGTH_FIRST, COLOR_FIRST);
        Rectangle secondRectangle = new Rectangle(WIDTH_SECOND, LENGTH_SECOND, COLOR_SECOND);

        Assert.assertEquals("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode(),
                firstRectangle.hashCode(), secondRectangle.hashCode());
    }

    @Test
    public void equalsOfRectangleWithNullValues() {
        Rectangle firstRectangle = new Rectangle(null, null, null);
        Rectangle secondRectangle = new Rectangle(null, null, null);

        Assert.assertTrue("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode()
                        + " and equals " + firstRectangle.equals(secondRectangle),
                firstRectangle.equals(secondRectangle));
    }

    @Test
    public void hashcodeOfRectangleWithNullValues() {
        Rectangle firstRectangle = new Rectangle(null, null, null);
        Rectangle secondRectangle = new Rectangle(null, null, null);

        Assert.assertEquals("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode(),
                firstRectangle.hashCode(), secondRectangle.hashCode());
    }
}
