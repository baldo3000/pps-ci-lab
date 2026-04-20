import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JavaTest {
    @Test
    public void testEquals() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void testException() {
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException();
        });
    }
}
