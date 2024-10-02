class Solution {
    public int search(int[] nums, int target) {
       int s=0;
       int e=nums.length-1;

       int ans = helper(nums,target,s,e);
       return ans;
    }

    public int helper(int[] nums, int target, int s,int e){
        if(s > e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            return helper(nums,target,mid+1,e);
        }
        else{
            return helper(nums,target,s,mid-1);
        }
    }
}
