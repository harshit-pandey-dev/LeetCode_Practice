class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int j=-1;
        for(int i=0;i<l;i++){
            if(nums[i]==0){
                j=i;  // for finding the the first zero 
                break;
            }
        }
        if(j!=-1){
        int temp;
        for(int i=j+1;i<l;i++){
            if(nums[i]!=0){
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
}