import java.util.*;

public class CoinChangeAnalysis {
    
    public static void main(String[] args) {
        int[] denominations = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
        int amount = 105;
        
        System.out.println("=== Malawi Coin Change Analysis ===");
        System.out.println("Denominations: " + Arrays.toString(denominations));
        System.out.println("Amount: " + amount + " MK\n");
        
        // Test greedy approach
        System.out.println("Greedy Algorithm Result:");
        greedyApproach(denominations, amount);
        
        System.out.println("\n=== Alternative Solutions ===");
        
        // Show all possible combinations for 105 MK
        findCombinations(denominations, amount);
    }
    
    public static void greedyApproach(int[] denominations, int amount) {
        Arrays.sort(denominations); // Ascending
        
        System.out.println("Step-by-step:");
        int remaining = amount;
        
        for (int i = denominations.length - 1; i >= 0; i--) {
            int coin = denominations[i];
            if (coin <= remaining) {
                int count = remaining / coin;
                System.out.println("  Take " + count + " × MK" + coin);
                remaining %= coin;
            }
        }
        
        if (remaining == 0) {
            System.out.println("Successfully made exact change!");
        } else {
            System.out.println("Could not make exact change!");
        }
    }
    
    public static void findCombinations(int[] denominations, int amount) {
        // For educational purposes, find minimal coins
        // Using DP to find optimal
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        
        for (int coin : denominations) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        System.out.println("Optimal number of coins (DP): " + 
                          (dp[amount] == Integer.MAX_VALUE ? "Not possible" : dp[amount]));
        
        // Compare with greedy
        int greedyCount = 0;
        int temp = amount;
        Arrays.sort(denominations);
        
        for (int i = denominations.length - 1; i >= 0; i--) {
            if (denominations[i] <= temp) {
                greedyCount += temp / denominations[i];
                temp %= denominations[i];
            }
        }
        
        System.out.println("Greedy number of coins: " + greedyCount);
        
        if (greedyCount == dp[amount]) {
            System.out.println("✓ Greedy is optimal for 105 MK!");
        } else {
            System.out.println("✗ Greedy is NOT optimal for 105 MK");
        }
    }
}

