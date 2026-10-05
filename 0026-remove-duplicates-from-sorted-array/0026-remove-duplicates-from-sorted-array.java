class Solution {
    public int removeDuplicates(int[] nums) {
        int l=nums.length;
        int i=0;
        for(int j=1;j<l;j++){
            if(nums[j]!=nums[j-1])
                i++;
                nums[i]=nums[j];
        }
        return i+1;
    }
}