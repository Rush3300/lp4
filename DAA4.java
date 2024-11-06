public class KnapsackDynamicProgramming {
    
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = values.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the dp array
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity]; // Maximum value
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3}; // Weights of items
        int[] values = {10, 15, 40}; // Values of items
        int capacity = 6; // Knapsack capacity

        int maxValue = knapsack(weights, values, capacity);
        System.out.println("Maximum value in the knapsack: " + maxValue);
    }
}
