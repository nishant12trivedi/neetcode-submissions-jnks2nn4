class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        return dfs(coins, amount, memo);
    }

    private int dfs(int[] coins, int amount, int[] memo) {
        if (amount == 0) return 0;
        if (amount < 0) return -1;

        if (memo[amount] != 0) return memo[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = dfs(coins, amount - coin, memo);

            if (res >= 0) {
                min = Math.min(min, res + 1);
            }
        }

        memo[amount] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[amount];
    }
}