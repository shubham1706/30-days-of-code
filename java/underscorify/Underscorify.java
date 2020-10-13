package underscorify;

import java.util.*;

class Underscorify {

    private static final int UNDEFINED = -10;
    static String underscorifySubstring(String str, String substring) {
        return underscorify(str, collapseLocations(getLocations(str, substring)));
    }

    static ArrayList<Integer> getLocations(String str, String substring) {
        ArrayList<Integer> locations = new ArrayList<>();
        for (int i=0; i<str.length()-substring.length()+1; i++) {
            if (str.substring(i, i+substring.length()).equals(substring)) {
                locations.add(i);
                locations.add(i+substring.length());
            }
        }
        return locations;
    }

    static ArrayList<Integer> collapseLocations(ArrayList<Integer> locations) {
        ArrayList<Integer> collapseLocations = new ArrayList<>(locations);
        Integer prev = UNDEFINED;
        for (Integer i : locations) {
            if (i.equals(prev) || i<prev) {
                collapseLocations.remove(i);
                collapseLocations.remove(prev);
                prev = UNDEFINED;
            } else {
                prev = i;
            }
        }
        return collapseLocations;
    }

    static String underscorify(String str, ArrayList<Integer> underscoreLocations) {
        StringBuilder output = new StringBuilder();
        int prev = 0;
        for (Integer location : underscoreLocations) {
            output.append(str, prev, location);
            output.append("_");
            prev = location;
        }
        output.append(str.substring(prev));
        return output.toString();
    }
}
