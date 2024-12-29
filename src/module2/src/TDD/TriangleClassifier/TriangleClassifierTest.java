package TDD.TriangleClassifier;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {
    private final TriangleClassifier classifier = new TriangleClassifier();

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Tam giác đều", classifier.classifyTriangle(2, 2, 2));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", classifier.classifyTriangle(2, 2, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Tam giác thường", classifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(8, 2, 3));
    }

    @Test
    public void testNegativeSide() {
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(-1, 2, 1));
    }

    @Test
    public void testZeroSide() {
        assertEquals("Không phải là tam giác", classifier.classifyTriangle(0, 1, 1));
    }
}
