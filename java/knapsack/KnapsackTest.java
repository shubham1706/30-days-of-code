package knapsack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {

    @Test
    void knapsackProblem() {
        int[][] items = {{1,2},{4,3},{5,6},{6,7}};
        Knapsack.knapsackProblem(items,10);
    }
}