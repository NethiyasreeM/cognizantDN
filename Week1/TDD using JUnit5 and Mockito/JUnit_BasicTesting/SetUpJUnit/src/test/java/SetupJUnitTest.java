import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SetupJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Tests - Setup Started");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All Tests - Cleanup Done");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each Test - Initialize");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Test - Cleanup");
    }

    @Test
    void testAddition() {
        int a = 5;
        int b = 10;

        int result = a + b;

        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        int a = 20;
        int b = 5;

        int result = a - b;

        assertEquals(15, result);
    }

    @Test
    void testTrueCondition() {
        boolean value = (10 > 5);

        assertTrue(value);
    }

    @Test
    void testNullExample() {
        String str = null;

        assertNull(str);
    }
}