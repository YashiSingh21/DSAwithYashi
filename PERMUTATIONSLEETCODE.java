class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,0,result);
        return result;
    }
    public void permutation(int[] nums,int s,List<List<Integer>> result){
        if(s == nums.length){
            List<Integer> A =new ArrayList<>();
            for(int i:nums){
                A.add(i);
            }
            result.add(A);
            return;
        }
        for(int i=s;i<nums.length;i++){
        swap(nums,s,i);
        permutation(nums,s+1,result);
        swap(nums,s,i);
        }
    }
    public void swap(int[] nums,int i ,int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
