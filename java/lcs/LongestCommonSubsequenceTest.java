package lcs;

import org.junit.jupiter.api.Test;

import java.util.List;

class LongestCommonSubsequenceTest {

    @Test
    void getLongestSubSequence1() {
        List<Character> lcs = LongestCommonSubsequence.getLongestCommonSubsequence("XKYKZPW" , "ZXVVYZW");
        assert validateLCS(lcs, "XYZW");
    }

    @Test
    void getLongestSubSequence2() {
        List<Character> lcs = LongestCommonSubsequence.getLongestCommonSubsequence("ABCDEF", "ABDFGEF");
        assert validateLCS(lcs, "ABDEF");
    }

    @Test
    void getLongestSubSequence3() {
        List<Character> lcs = LongestCommonSubsequence.getLongestCommonSubsequence("ABC", "DEF");
        assert validateLCS(lcs, "");
    }

    @Test
    void getLongestSubSequence4() {
        List<Character> lcs = LongestCommonSubsequence.getLongestCommonSubsequence("", "");
        assert validateLCS(lcs, "");
    }


    private boolean validateLCS(List<Character> lcs, String result) {
        StringBuilder strBuilder = new StringBuilder();
        for (Character c : lcs)
            strBuilder.append(c);
        return strBuilder.toString().equals(result);
    }
}