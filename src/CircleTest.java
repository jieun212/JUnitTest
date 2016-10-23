/*
 * TCSS 305 - Winter 2016 
 * Assignment 1 - Testing
 */

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;
import org.junit.Before;
import org.junit.Test;

/**
 * The CircleTest is a unit test for Circle class and covers all the methods in
 * Circle class.
 * 
 * @author Jieun Lee
 * @version 1.1 (01-14-2015)
 */
public class CircleTest {

    /**
     * The tolerance for difference between radiuses of the circles.
     */
    private static final double TOLERANCE = 0.00000001;

    /**
     * A test circle.
     */
    private Circle myCircleTest;

    /**
     * Sets up new circle for testing.
     * 
     * @throws java.lang.Exception when there is an issue
     */
    @Before
    public void setUp() throws Exception {
        myCircleTest = new Circle();
    }

    /**
     * Test method for
     * {@link Circle#Circle(double, java.awt.Point, java.awt.Color)}.
     */
    @Test
    public void testCircleDoublePointColor() {
        myCircleTest = new Circle(100.0, new Point(5, 8), Color.GREEN);
        assertEquals(100.0, myCircleTest.getRadius(), TOLERANCE);
        assertEquals(new Point(5, 8), myCircleTest.getCenter());
        assertEquals(Color.GREEN, myCircleTest.getColor());
    }

    /**
     * Test method for {@link Circle#Circle()}.
     */
    @Test
    public void testCircle() {
        assertEquals(1.0, myCircleTest.getRadius(), TOLERANCE);
        assertEquals(new Point(0, 0), myCircleTest.getCenter());
        assertEquals(Color.BLACK, myCircleTest.getColor());
    }

    /**
     * Test method for {@link Circle#setRadius(double)}.
     */
    @Test
    public void testSetRadius() {
        myCircleTest.setRadius(3.2);
        assertEquals(3.2, myCircleTest.getRadius(), TOLERANCE);
    }

    /**
     * Test method for {@link Circle#setCenter(java.awt.Point)}.
     */
    @Test
    public void testSetCenter() {
        myCircleTest.setCenter(new Point(4, 6));
        assertEquals(new Point(4, 6), myCircleTest.getCenter());
    }

    /**
     * Test method for {@link Circle#setColor(java.awt.Color)}.
     */
    @Test
    public void testSetColor() {
        myCircleTest.setColor(Color.YELLOW);
        assertEquals(Color.YELLOW, myCircleTest.getColor());
    }

    /**
     * Test method for {@link Circle#getRadius()}.
     */
    @Test
    public void testGetRadius() {
        assertEquals(1.0, myCircleTest.getRadius(), TOLERANCE);
    }

    /**
     * Test method for {@link Circle#getCenter()}.
     */
    @Test
    public void testGetCenter() {
        assertEquals(new Point(0, 0), myCircleTest.getCenter());
    }

    /**
     * Test method for {@link Circle#getColor()}.
     */
    @Test
    public void testGetColor() {
        assertEquals(Color.BLACK, myCircleTest.getColor());
    }

    /**
     * Test method for {@link Circle#calculateDiameter()}.
     */
    @Test
    public void testCalculateDiameter() {
        assertEquals(1.0 * 2, myCircleTest.calculateDiameter(), TOLERANCE);
    }

    /**
     * Test method for {@link Circle#calculateCircumference()}.
     */
    @Test
    public void testCalculateCircumference() {
        assertEquals(1.0 * 2 * Math.PI, myCircleTest.calculateCircumference(), TOLERANCE);
    }

    /**
     * Test method for {@link Circle#calculateArea()}.
     */
    @Test
    public void testCalculateArea() {
        assertEquals(Math.pow(1.0, 2) * Math.PI, myCircleTest.calculateArea(), TOLERANCE);
    }

    /**
     * Test method for {@link Circle#toString()}.
     */
    @Test
    public void testToString() {
        assertEquals("Circle [radius=1.00, center=java.awt.Point[x=0,y=0], "
                     + "color=java.awt.Color[r=0,g=0,b=0]]", myCircleTest.toString());
    }

    /**
     * Test method for throw IllegalArgumentException for zero value of radius
     * in constructor.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCicleIllegalArgumentExceptionForZero() {
        myCircleTest = new Circle(0, new Point(5, 5), Color.BLUE);
    }

    /**
     * Test method for throw IllegalArgumentException for negative value of
     * radius in constructor.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCicleIllegalArgumentExceptionForNegative() {
        myCircleTest = new Circle(-4.4, new Point(5, 5), Color.BLUE);
    }

    /**
     * Test method for throw IllegalArgumentException for zero value of radius
     * in setRadius() method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void tesSetRaidusIllegalArgumentExceptionForZero() {
        myCircleTest.setRadius(0);
    }

    /**
     * Test method for throw IllegalArgumentException for negative value of
     * radius in setRadius() method.
     */
    @Test(expected = IllegalArgumentException.class)
    public void tesSetRaidusIllegalArgumentExceptionForNegative() {
        myCircleTest.setRadius(-2.3);
    }

    /**
     * Test method for throw NullPointerException for center in constructor.
     */
    @Test(expected = NullPointerException.class)
    public void testCircleNullPointerExceptionForCenter() {
        myCircleTest = new Circle(3.0, null, Color.GRAY);
    }

    /**
     * Test method for throw NullPointerException for center in setCenter()
     * method.
     */
    @Test(expected = NullPointerException.class)
    public void testSetCenterNullPointerException() {
        myCircleTest.setCenter(null);
    }

    /**
     * Test method for throw NullPointerException for color in constructor.
     */
    @Test(expected = NullPointerException.class)
    public void testCircleNullPointerExceptionForColor() {
        myCircleTest = new Circle(3.0, new Point(3, 4), null);
    }

    /**
     * Test method for throw NullPointerException for center in setColor()
     * method.
     */
    @Test(expected = NullPointerException.class)
    public void testSetColorNullPointerException() {
        myCircleTest.setColor(null);
    }
}
