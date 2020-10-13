package boggle_board;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoggleBoardTest {

    @Test
    void getMatchingWords() {
        char[][] board = new char[][] {{'a','b'}};
        String[] words = new String[] {"a"};
        List<String> matchingWords = BoggleBoardV2.getMatchedWords(board, words);
        for (String word : matchingWords) {
            System.out.println(word);
        }
    }

    @Test
    void getMatchingWord2() {
        char[][] board = new char[][] {{'t','h','i','s','i','s','a'},
                {'s','i','m','p','l','e','x'},
                {'b','x','x','x', 'x','e','b'},
                {'x','o','g','g','l','x','o'},
                {'x','x','x','D','T','r','a'},
                {'R','E','P','E','A','d','x'},
                {'x','x','x','x','x','x','x'},
                {'N','O','T','R','E','-','P'},
                {'x','x','D','E','T','A','E'}};
        String[] words = new String[] {"this","is","not","a","simple","boggle","board","test","REPEATED","NOTRE-PEATED"};
        List<String> matchingWords = BoggleBoardV2.getMatchedWords(board, words);
        for (String word : matchingWords) {
            System.out.println(word);
        }
    }

    @Test
    void getMatchingWord3() {
        char[][] board = new char[][] {{'c','o','m'},
                {'r','p','l'},
                {'c','i','t'},
                {'o','a','e'},
                {'f','o','d',},
                {'z','r','b'},
                {'g','i','a'},
                {'o','a','g'},
                {'f','s','z'},
                {'t','e','i'},
                {'t','w','d'},
        };
        String[] words = new String[] {"commerce","complicated","twisted","zigzag","comma","foobar","baz","there"};
        ArrayList<String> matchingWords = BoggleBoard.getMatchingWords(board, words);
        for (String word : matchingWords) {
            System.out.println(word);
        }
    }
}