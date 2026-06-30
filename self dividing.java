class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        // Loop through each number within the given range
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    // Helper function to check if a number is self-dividing
    private boolean isSelfDividing(int num) {
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            
            // A self-dividing number cannot contain the digit 0 
            // and must be perfectly divisible by all its digits
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            
            temp /= 10; // Remove the last digit
        }
        
        return true;
    }
}