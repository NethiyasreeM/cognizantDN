import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MockitoTest {

    @Test
    void testMocking() {

        UserService service = mock(UserService.class);

        when(service.getUserName()).thenReturn("Nethiya");

        assertEquals("Nethiya", service.getUserName());

        System.out.println("Mocking and Stubbing Successful.");
    }
}