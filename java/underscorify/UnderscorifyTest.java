package underscorify;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class UnderscorifyTest {

    @Test
    void underscorifySubstringTest() {
        System.out.print(Underscorify.underscorifySubstring("testthis is a testtest to see if testestest it works", "test"));
    }

    @Test
    void getLocationsTest() {
        ArrayList<Integer> locations = Underscorify.getLocations("testthis is a testtest to see if testestest it works", "test");
        for (Integer i : locations) {
            System.out.print(i+" ");
        }
    }

    @Test
    void collapseLocationsTest() {
        ArrayList<Integer> locations = Underscorify.getLocations("testthis is a testtest to see if testestest it works", "test");
        ArrayList<Integer> collapsedLocations = Underscorify.collapseLocations(locations);
        for (Integer i : collapsedLocations) {
            System.out.print(i+" ");
        }
    }

    @Test
    void underscorifyTest() {
    }
}