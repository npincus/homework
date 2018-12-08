
public class tenth {
    public boolean canJump(int[] nums) {
        int hitsEnd = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= hitsEnd) {
                hitsEnd = i;
            }
        }
        return hitsEnd == 0;
    }
}
/* ideal:not used
    d7: what i saw was we can go forward but its going to suck as we have to cheak ever place may times, mean its easy to
    go backward, so it becomes simpler as its just a boolean array of the same size as nums and we mark if this point
    reaches the end but then i saw i did not really need the array after i build it but simple the index of the most resent
    element that hits the end and if the index ever hits 0 we made it threw the list and can jump
    Q:would love to think about this in 2d
 */