class Solution {
    public int countOdds(int low, int high) {
        // Total odd numbers in [0, high] minus odd numbers in [0, low - 1]
        return (high + 1) / 2 - (low / 2);
    }
}