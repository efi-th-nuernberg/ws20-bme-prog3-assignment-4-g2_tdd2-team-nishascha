import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 3;
        float b = 3;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

    }

    @Test 
    public void checkNormal(){
      assertEquals(TriangleChecker.TriangleType.NORMAL, TriangleChecker.checkTriangle( 1, 2, 3 ));
    }

    @Test 
    public void checkNone(){
      assertEquals(TriangleChecker.TriangleType.NONE, TriangleChecker.checkTriangle( 0, 1, 2 ));
    }

    @Test 
    public void checkIsosceles(){
      assertEquals(TriangleChecker.TriangleType.ISOSCELES, TriangleChecker.checkTriangle( 1, 2, 2 ));
    }

    @Test 
    public void checkEquilateral(){
      assertEquals(TriangleChecker.TriangleType.EQUILATERAL, TriangleChecker.checkTriangle( 1, 1, 1 ));
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
