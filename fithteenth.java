class fithteenth {
    long fact(int k)
    {
        long product = 1;
        for(int i = 1; i <= k; i++){
            product *= i;
        }

        return product;
    }
    public int uniquePaths(int m, int n) {
        int choices=n+m-2;
        if(m==1||n==1){
            return 1;
        }
        long top=fact(choices);
        long bot=fact(m-1)*fact(n-1);
        long ret=top/bot;
        return (int) ret;
    }
}
/* so i did not use any of the solution methods as i saw this was just a simple combinitorics question
    the problem is i have no clue how big 100!*100! and its makeing it so i need to change to a diffrent date type and
    long is not big enough. so im likely dumb
 */