package boggle_board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BoggleBoardV2 {

    char[][] board;
    String[] words;
    private Trie wordsTrie;

    BoggleBoardV2(char[][] board, String[] words) {
        this.board = board;
        this.words = words;
        wordsTrie = new Trie(words);
    }

    public static List<String> getMatchedWords (char[][] board, String[] words) {
        BoggleBoardV2 boggleBoard = new BoggleBoardV2(board, words);
        boggleBoard.wordsTrie = new Trie(words);
        HashSet<String> matchedWords = new HashSet<>();
        for (int i=0; i<board.length; ++i) {
            for (int j=0; j<board[0].length; ++j) {
                    boolean[][] isVisited = new boolean[board.length][board[0].length];
                    getMatchedWords(boggleBoard, boggleBoard.wordsTrie.root, i, j, matchedWords, isVisited);
            }
        }

        return new ArrayList<>(matchedWords);
    }

    private static void getMatchedWords(BoggleBoardV2 boggleBoard, TrieNode node, int posI, int posJ, HashSet<String> matchedWords, boolean[][] isVisited) {
        if (node.children.containsKey(boggleBoard.board[posI][posJ]) && !isVisited[posI][posJ]) {
            isVisited[posI][posJ] = true;
            node = node.children.get(boggleBoard.board[posI][posJ]);

            if (node.children.containsKey(Trie.endSymbol))
                matchedWords.add(node.value);

            for (List<Integer> position : getAllNeighbours(boggleBoard.board, posI, posJ)) {
                getMatchedWords(boggleBoard, node, position.get(0), position.get(1), matchedWords, isVisited);
            }

            isVisited[posI][posJ] = false;
        }
    }

    private static List<List<Integer>> getAllNeighbours(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        List<List<Integer>> neighbours = new ArrayList<>();

        if (i-1>=0 && j-1>=0) {
            List<Integer> position = new ArrayList<>();
            position.add(i-1);
            position.add(j-1);
            neighbours.add(position);
        }

        if (i-1>=0){
            List<Integer> position = new ArrayList<>();
            position.add(i-1);
            position.add(j);
            neighbours.add(position);
        }

        if (i-1>=0 && j+1<n) {
            List<Integer> position = new ArrayList<>();
            position.add(i-1);
            position.add(j+1);
            neighbours.add(position);
        }

        if (j+1<n) {
            List<Integer> position = new ArrayList<>();
            position.add(i);
            position.add(j+1);
            neighbours.add(position);
        }

        if (i+1<m && j+1<n) {
            List<Integer> position = new ArrayList<>();
            position.add(i+1);
            position.add(j+1);
            neighbours.add(position);
        }

        if (i+1<m) {
            List<Integer> position = new ArrayList<>();
            position.add(i+1);
            position.add(j);
            neighbours.add(position);
        }

        if (i+1<m && j-1>=0) {
            List<Integer> position = new ArrayList<>();
            position.add(i+1);
            position.add(j-1);
            neighbours.add(position);
        }

        if (j-1>=0) {
            List<Integer> position = new ArrayList<>();
            position.add(i);
            position.add(j-1);
            neighbours.add(position);
        }

        return neighbours;
    }

    private static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        // value of the string which matches
        String value;
    }

    private static class Trie {
        TrieNode root = new TrieNode();
        static char endSymbol = '*';

        Trie(String[] words) {
            for (String string : words) {
                TrieNode temp = root;
                for (char c : string.toCharArray()) {
                    if (!temp.children.containsKey(c)) {
                        TrieNode newNode = new TrieNode();
                        temp.children.put(c, newNode);
                        temp = newNode;
                    } else {
                        temp = temp.children.get(c);
                    }
                }
                temp.children.put('*', new TrieNode());
                temp.value = string;
            }
        }
    }
}
