package lcs;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    private String str1, str2;
    private int[][] memory;
    private String lcs;

    private LongestCommonSubsequence(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        this.memory = new int[str1.length()+1][str2.length()+1];
    }

    private void buildLcsInMemory() {
        for (int i=1; i<memory.length; i++) {
            for (int j=1; j<memory[0].length; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1))
                    memory[i][j] = memory[i-1][j-1] + 1;
                else
                    memory[i][j] = Math.max(memory[i][j-1], memory[i-1][j]);
            }
        }
    }

    private void printMemory() {
        for (int[] row : memory) {
            for (int elem : row) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }

    private void getLcs() {
        int i = memory.length-1;
        int j = memory[0].length-1;
        StringBuilder lcsBuilder = new StringBuilder();

        while (memory[i][j] != 0) {
            if (memory[i][j-1] == memory[i][j])
                --j;
            else if (memory[i-1][j] == memory[i][j])
                --i;
            else {
                --i;
                --j;
                lcsBuilder.append(str1.charAt(i));
            }
        }
        lcsBuilder.reverse();
        lcs = lcsBuilder.toString();
    }

    private static List<Character> convertLcsToCharacterArray(String lcs) {
        List<Character> charList = new ArrayList<>();
        for (Character c : lcs.toCharArray()) {
            charList.add(c);
        }
        return charList;
    }

    static List<Character> getLongestCommonSubsequence(String str1, String str2) {
        LongestCommonSubsequence obj = new LongestCommonSubsequence(str1, str2);
        obj.buildLcsInMemory();
        obj.printMemory();
        obj.getLcs();
        System.out.println("LCS : " + obj.lcs);
        return convertLcsToCharacterArray(obj.lcs);
    }

}
