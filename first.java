class first {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;

        //shifts right and multiply [1,2,3,4]->[1,1,2,6]
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] * nums[i - 1];
        }
        int right=1;//composets from right from left
        //shifts left[1,1,2,6]->[24,12,8,6]
        for (int i = n - 1; i >= 0; i--) {
            dp[i] *= right;
            right *= nums[i];//composets after finding current value so dp is not inclueading it self in the sum
        }
        return dp;
    }
}

/*  ideal:
    how do i not multiply the current value when finding the product of the set with out removeing on this index
    D7:
    so a give number is lift*right sums is what i see instantly
    first i think of 2 lists but here i realize i only need 1 list and an accumulator and the accumulator will only grow
    after i find the current value, for index cleanness i shift the first list right 1 time as it will be n-1 in size
    now its n and the first index is filled with 1 the multiplicative identity this just leads to less code needed and
    not careing about index out of bounds problems
    Q: why are we doing so much work just to avoid division?
 */