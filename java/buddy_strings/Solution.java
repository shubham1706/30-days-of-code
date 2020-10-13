package buddy_strings;

import java.util.HashSet;

class Solution {
    static boolean buddyStrings(String A, String B) {
        int no_of_unmatched_chars = 0;
        boolean duplicate_chars = false;
        HashSet<Character> characters = new HashSet<>();
        char[][] unmatched_chars  = new char[2][2];

        if (A.length()!=B.length())
            return false;
        else {
            for (int i=0; i<A.length(); i++ ) {
                if (A.charAt(i)!=B.charAt(i)) {
                    characters.add(A.charAt(i));
                    if (no_of_unmatched_chars >= 2)
                        return false;
                    unmatched_chars[0][no_of_unmatched_chars] = A.charAt(i);
                    unmatched_chars[1][no_of_unmatched_chars] = B.charAt(i);
                    no_of_unmatched_chars += 1;
                } else {
                    duplicate_chars = !characters.add(A.charAt(i));
                }
            }
            if (no_of_unmatched_chars==0)
              return duplicate_chars;
            else {
                return unmatched_chars[0][0]==unmatched_chars[1][1] && unmatched_chars[0][1] == unmatched_chars[1][0];
            }
        }

    }
}
