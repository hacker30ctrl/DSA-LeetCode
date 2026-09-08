class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int zero=0;
        for(int x:nums){
            if(x==0){
                zero++;
            }
        }
        int i=n-1;
        int curr=zero;
        while(curr>0){
            if(nums[i]==0){
                zero--;
            }
            curr--;
            i--;
        }
        return zero;
    }
}