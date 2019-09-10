class Solution {
    public double myPow(double x, int n) {
        
        if (n == 0 || x == 1) {
            return 1;
        }
        double tmp = myPow(x, n / 2);
        if (n % 2 != 0) {
            return n < 0 ? 1 / x * tmp * tmp : x * tmp * tmp;
        }
        return tmp * tmp;
    }
}