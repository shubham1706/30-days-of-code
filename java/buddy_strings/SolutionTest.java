package buddy_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void buddyStrings1() {
        assertTrue(Solution.buddyStrings("ab", "ba"));
    }

    @Test
    void buddyStrings2() {
        assertFalse(Solution.buddyStrings("ab", "ab"));
    }

    @Test
    void buddyStrings3() {
        assertTrue(Solution.buddyStrings("aa", "aa"));
    }

    @Test
    void buddyStrings4() {
        assertFalse(Solution.buddyStrings("aaaaaaabc", "aaaaaaacd"));
    }

    @Test
    void buddyStrings5() {
        assertFalse(Solution.buddyStrings("", "aa"));
    }
}