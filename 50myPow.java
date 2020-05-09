class Solution {
    public double myPow(double x, int n) {
        double result = 1;
        if(n == 0 || x == 1) return 1;
        if(x == -1) return n%2==0?1:-1;
        
        if(n<0){
            n = -n;
            x = 1/x;
        }
        if(n <= Integer.MIN_VALUE) return 0;
        while(n>0){
            if(n%2 ==1) result *=x;
            x = x*x;
            n = n >> 1;
        }
        return result;
    }
}
