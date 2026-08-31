import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LaughTest {

    private ThreeRules trois;

    @BeforeEach
    void setUp() {
        trois = new ThreeRules();
    }

    @DisplayName("laugh(1) -> \"HA\"")
    @Test
    void laugh_Test01() {
        assertEquals("HA", trois.laugh(1), "one HA");
    }

    @DisplayName("laugh(2) -> \"HAHA\"")
    @Test
    void laugh_Test02() {
        assertEquals("HAHA", trois.laugh(2), "two HAs, no space between");
    }

    @DisplayName("laugh(3) -> \"HAHAHA\"")
    @Test
    void laugh_Test03() {
        assertEquals("HAHAHA", trois.laugh(3), "three HAs");
    }

    @DisplayName("laugh(5) -> \"HAHAHAHAHA\"")
    @Test
    void laugh_Test04() {
        assertEquals("HAHAHAHAHA", trois.laugh(5), "five HAs");
    }

    @DisplayName("laugh(10) -> \"HAHAHAHAHAHAHAHAHAHA\"")
    @Test
    void laugh_Test05() {
        assertEquals("HAHAHAHAHAHAHAHAHAHA", trois.laugh(10), "ten HAs");
    }

    @DisplayName("laugh(4) is made only of HA -- no spaces, newlines or other characters")
    @Test
    void laugh_Test06() {
        String result = trois.laugh(4);
        assertTrue(result.matches("(HA)+"), "laugh(4) should match (HA)+ pattern, got: \"" + result + "\"");
    }

    @DisplayName("laugh(0) -> \"\" (base case: zero HAs is the empty string)")
    @Test
    void laugh_Test07() {
        assertEquals("", trois.laugh(0), "laugh(0) is the empty string -- stop at 0, not at 1");
    }
}
