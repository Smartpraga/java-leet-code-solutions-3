class Solution {
    public int commonFactors(int a, int b) {
        // Find the Greatest Common Divisor
        int gcdValue = gcd(a, b);
        int count = 0;
        
        // Find factors of the GCD up to its square root
        for (int i = 1; i * i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                count++; // i is a factor
                if (i * i != gcdValue) {
                    count++; // gcdValue / i is also a factor
                }
            }
        }
        return count;
    }
    
    // Helper function to calculate GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}