package suffix_trie;

import java.util.HashMap;

public class Program {
    // Do not edit the class below except for the
    // populateSuffixTrieFrom and contains methods.
    // Feel free to add new properties and methods
    // to the class.
    static class TrieNode {
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str) {
            // Write your code here.
            for (int i=0; i<str.length()-1; ++i) {
                TrieNode temp = root;
                for (int j=i; j<str.length()-1; ++j) {
                    TrieNode newNode = new TrieNode();
                    if (!temp.children.containsKey(str.charAt(j)))
                        temp.children.put(str.charAt(j), newNode);
                    temp = newNode;
                }
                temp.children.put('*', new TrieNode());
            }
        }

        public boolean contains(String str) {
            // Write your code here.
            TrieNode temp = root;
            for (char c: str.toCharArray()) {
                if (!temp.children.containsKey(c))
                    return false;
                temp = temp.children.get(c);
            }
            return temp.children.containsKey('*');
        }
    }
}

