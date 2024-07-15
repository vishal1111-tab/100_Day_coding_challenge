class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;

        boolean sign = true;

        if (dividend <= 0 && divisor > 0) sign = false;
        if (dividend >= 0 && divisor < 0) sign = false;

        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);

        long ans = 0;
        while (n >= m) {
            int count = 0;

            while ((m << (count + 1)) <= n) {
                count++;
            }
            ans += (1L << count);
            n -= (m << count);
        }

        if (ans > (1L << 31) - 1 && sign) {
            return Integer.MAX_VALUE;
        }
        if (ans < -(1L << 31) && sign) {
            return Integer.MIN_VALUE;
        }

        if (sign) {
            return (int) ans;
        }
        return (int) -ans;
    }
}
