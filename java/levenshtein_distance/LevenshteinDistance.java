package levenshtein_distance;

class LevenshteinDistance {
    static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        int m = str1.length();
        int n = str2.length();

        int[][] minOps = new int[m+1][n+1];
        for(int i=0; i<m+1; i++) {
            minOps[i][0] = i;
        }
        for(int i=0; i<n+1; i++) {
            minOps[0][i] = i;
        }
        for (int i=1; i<m+1; i++) {
            for (int j=1; j<n+1; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1))
                    minOps[i][j] = minOps[i-1][j-1];
                else
                    minOps[i][j] = Math.min(Math.min(minOps[i-1][j], minOps[i][j-1]),  minOps[i-1][j-1]) + 1;
            }
        }
        return minOps[m][n];
    }
}
