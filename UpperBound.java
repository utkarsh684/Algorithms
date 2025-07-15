class Solution {
    public int upperBound(int[] nums, int x) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=x){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }
}
