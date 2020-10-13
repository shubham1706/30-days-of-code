package levenshtein_distance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LevenshteinDistanceTest {

    @Test
    void levenshteinDistance1() {
        Assertions.assertEquals(LevenshteinDistance.levenshteinDistance("abcd","abce"),1);
    }

    @Test
    void levenshteinDistance2() {
        Assertions.assertEquals(LevenshteinDistance.levenshteinDistance("abxcd","abace"),2);
    }

    @Test
    void levenshteinDistance3() {
        Assertions.assertEquals(LevenshteinDistance.levenshteinDistance("apple","mopped"),4);
    }

    @Test
    void levenshteinDistance4() {
        Assertions.assertEquals(LevenshteinDistance.levenshteinDistance("hello","help"),2);
    }

    @Test
    void levenshteinDistance5() {
        Assertions.assertEquals(LevenshteinDistance.levenshteinDistance("","abadce"),6);
    }
}