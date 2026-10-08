class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
        if(nums[i]==nums[j]){
            xor=xor^nums[i];
        }
            }
        }
     
        return  xor;
    }
}