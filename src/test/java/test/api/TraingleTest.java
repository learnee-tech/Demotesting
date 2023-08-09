package test.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import app.Triangle;
public class TraingleTest {
	
	Triangle obj;
	
	@Before
	public void setUp() {
		obj = new Triangle();	
	}
	
	@Test
    public void testEquilateralTriangle() {
        Triangle t = new Triangle(5, 5, 5);
        assertEquals("Equilateral", t.showType());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle t = new Triangle(5, 5, 3);
        assertEquals("Isosceles", t.showType());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle t = new Triangle(3, 4, 5);
        assertEquals("Scalene", t.showType());
    }
}
