class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit (rightmost)
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0 (carrying over 1 to the next left digit)
            digits[i] = 0;
        }
        
        // If the loop finished, it means ALL digits were 9s (e.g., [9, 9, 9] -> [0, 0, 0])
        // We need an extra space for the leading 1 (e.g., [1, 0, 0, 0])
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // Remaining indices default to 0 automatically in Java
        
        return newDigits;
    }
}
