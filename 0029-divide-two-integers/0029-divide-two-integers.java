class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

      
        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);
        
        int result = 0;

        while (n >= m) {
            long temp = m, multiple = 1;
            
            while (n >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            
            n -= temp;
            result += multiple;
        }

        return isNegative ? -result : result;
    }
}
