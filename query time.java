class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        
        // Iterate through each student's time interval
        for (int i = 0; i < startTime.length; i++) {
            // Check if queryTime is within the student's range [startTime[i], endTime[i]]
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        
        return count;
    }
}