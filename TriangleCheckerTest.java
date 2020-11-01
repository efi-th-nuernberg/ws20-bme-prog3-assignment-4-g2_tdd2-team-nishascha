import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 0;
        float b = 4;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        /*assertEquals(TriangleChecker.TriangleType.NORMAL, type);*/
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

}
