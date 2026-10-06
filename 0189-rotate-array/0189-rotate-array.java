class Solution {
    public void rotate(int[] nums, int k) {
       int l = nums.length;
       k=k%l;
       int[] temp = new int[k];
       int j=0;
       for(int i=l-k;i<l;i++){
        temp[j]=nums[i];
        j++;
       }
       for(int a=l-k-1;a>=0;a--){
        nums[a+k]=nums[a];
       }
       for(int c=0;c<k;c++){
        nums[c]=temp[c];
       }
    }
}