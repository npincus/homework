public class third {
    public int findDuplicate(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];

        //finds a loop
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        hare = nums[0];
        //finds the last element in the lead up
        while (hare != tortoise) {
            hare = nums[hare];
            tortoise = nums[tortoise];
        }
        return tortoise;
    }
}
/*
    ideal: where is the duplicate?
    d7: so first i saw that no value in nums is greater then the number of indexs and all are represented other then 0
    next i saw that with more space we could do this easly with one pass and just cheak if we have already seen this number
    next i saw that this could be seen as a linked list where the value point to the index of the number to go to next
    and this list will have a loop thanks to PPH so then question becomes how do i find a loop in a linked list and then
    how do i navigate to the element before the loop starts and this is the 2 pointer problem
    Q:what is the best order of solution in O time?
 */