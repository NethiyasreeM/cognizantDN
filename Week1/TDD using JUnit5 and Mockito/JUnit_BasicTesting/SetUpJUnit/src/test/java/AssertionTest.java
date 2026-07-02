import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AssertionTest {

    @Test
    void testAssertions() {

        int sum = 10 + 20;

        assertEquals(30, sum);
        assertNotEquals(50, sum);

        assertTrue(sum > 0);
        assertFalse(sum < 0);

        String name = "Nethiya";

        assertNotNull(name);
        assertNull(null);

        System.out.println("All Assertions Passed Successfully.");
    }
}