class twelve {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp=nums1.length+nums2.length;
        int[] sorted=new int[temp/2+1];
        int j=0;
        int k=0;
        for(int i=0;i<sorted.length;i++){
            if(j<nums1.length&&k<nums2.length){
                if(nums1[j]>nums2[k]){
                    sorted[i]=nums2[k];
                    k++;
                }else{
                    sorted[i]=nums1[j];
                    j++;
                }
            }else if(j==nums1.length){
                sorted[i]=nums2[k];
                k++;
            }else {
                sorted[i]=nums1[j];
                j++;
            }
            if(i==sorted.length-1){
                if(temp%2==0) return (sorted[i]+sorted[i-1])/2.0;
                else return (sorted[i]);
            }
        }

        return 0;
    }
}
/* no ideal:
    d7: so what i saw is that as the list are sorted you could just stick them together
    and as you only need the middle element you only need to go threw n+m/2 elements
    and then you simple add the lists and when you get to the middle element you need to know if the list was odd or
    even but thats all you need
 */