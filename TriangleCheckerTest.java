import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = -2;
        float b = -4;
        float c = -4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        /*assertEquals(TriangleChecker.TriangleType.NORMAL, type);*/
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }
     @Test

    public void testNoTriangleThreeNegativeSides() {

        assertEquals( TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( -1f, -1f, -1f ) );

    }



    @Test

    public void testNoTriangleTwoNegativeSides() {

        assertEquals( TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( -1f, -1f, 1f ) );

    }


}
