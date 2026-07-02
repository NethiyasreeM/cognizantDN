import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VerifyTest {

    @Test
    void testVerifyInteraction() {

        UserService service = mock(UserService.class);

        service.getUserName();

        verify(service).getUserName();

        System.out.println("Interaction Verified Successfully.");
    }
}