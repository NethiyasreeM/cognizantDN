import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AAATest {

    @BeforeEach
    void setUp() {
        System.out.println("Setup executed.");
    }

    @Test
    void testAddition() {

        // Arrange
        int num1 = 15;
        int num2 = 25;

        // Act
        int result = num1 + num2;

        // Assert
        assertEquals(40, result);

        System.out.println("AAA Pattern Test Passed.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown executed.");
    }
}