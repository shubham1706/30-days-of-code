package boggle_board;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// todo : wrong approach, SEE BoggleBoardV2
class BoggleBoard {
    private char[][] board;
    private HashMap<Character, ArrayList<ArrayList<Integer>>> characterPositions;

    BoggleBoard (char[][] board) {
        this.board = board;
        characterPositions = new HashMap<>();
        int i=0;
        for (char[] row : board) {
            int j=0;
            for (char c : row) {
                // if key is not present, then instantiate a new ArrayList for that key
                if (!characterPositions.containsKey(c))
                    characterPositions.put(c, new ArrayList<>());
                ArrayList<Integer> pos = new ArrayList<>();
                pos.add(i);
                pos.add(j);
                characterPositions.get(c).add(pos);
                ++j;
            }
            ++i;
        }
    }

    private void printBoggleBoard() {
        System.out.println("BOARD :-");
        int i=0, j=0;
        for (char[] row : board) {
            System.out.print(i+" ");
            for (char c : row) {
                System.out.print(c+" ");
                ++j;
            }
            ++i;
            System.out.println();
        }
        System.out.println("POSITIONS :-");
        for (Map.Entry<Character, ArrayList<ArrayList<Integer>>> keyValue : characterPositions.entrySet()) {
            System.out.println("Key : " + keyValue.getKey());
            for (ArrayList<Integer> position : keyValue.getValue()) {
                System.out.println("Position : i (y) = " + position.get(0) + "\t j (x) = "+position.get(1));
            }
            System.out.println();
        }
    }

    private ArrayList<ArrayList<Integer>> getAllOccurrences(char c) {
        return characterPositions.getOrDefault(c, null);
    }

    private boolean find(String word) {
        if (getAllOccurrences(word.charAt(0))==null)
            return false;
        // if only one character present on the board and that matches
        if (board[0][0]==word.charAt(0) && word.length()==1 && board.length==1 && board[0].length==1)
            return true;
        for (ArrayList<Integer> position : getAllOccurrences(word.charAt(0))) {
            int posI = position.get(0);
            int posJ = position.get(1);
            if (find(posI, posJ, word, new boolean[board.length][board[0].length]))
                return true;
        }
        return false;
    }

    private boolean find(int posI, int posJ, String word, boolean[][] visited) {
        if (board[posI][posJ]!=word.charAt(0))
            return false;

        boolean[][] tempVisited = new boolean[board.length][board[0].length];
        for (int i=0; i<visited.length; ++i) {
            System.arraycopy(visited[i], 0, tempVisited[i], 0, visited[0].length);
        }
        tempVisited[posI][posJ] = true;
        // if this is the last character remaining in the word and it matched, then return true
        if (word.length()==1)
            return true;

        if (posJ>0 && !visited[posI][posJ-1] && find(posI, posJ-1, word.substring(1),visited)) {
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posJ<board[0].length-1 && !visited[posI][posJ+1] && find(posI, posJ+1, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posI>0 && !visited[posI-1][posJ] && find(posI-1, posJ, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posI<board.length-1 && !visited[posI+1][posJ] && find(posI+1, posJ, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posI>0 && posJ>0 && !visited[posI-1][posJ-1] && find(posI-1, posJ-1, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posI>0 && posJ<board[0].length-1 && !visited[posI-1][posJ+1] && find(posI-1, posJ+1, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        if (posI<board.length-1 && posJ>0 && !visited[posI+1][posJ-1] && find(posI+1, posJ-1, word.substring(1),visited)){
            for (int i=0; i<visited.length; ++i) {
                System.arraycopy(tempVisited[i], 0, visited[i], 0, visited[0].length);
            }
            return true;
        }

        return posI < board.length - 1 && posJ < board[0].length - 1 && !visited[posI + 1][posJ + 1] && find(posI + 1, posJ + 1, word.substring(1), visited);
    }

    static ArrayList<String> getMatchingWords (char[][] board, String[] words) {
        BoggleBoard boggleBoard = new BoggleBoard(board);
//        boggleBoard.printBoggleBoard();
        ArrayList<String> wordsFound = new ArrayList<>();
        for (String word : words) {
            if (boggleBoard.find(word))
                wordsFound.add(word);
        }
        return wordsFound;
    }
}
