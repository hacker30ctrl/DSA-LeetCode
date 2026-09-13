import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Set <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        Integer[] arr=set.toArray(new Integer[0]);
        Arrays.sort(arr);
        int n=arr.length;
        if(arr.length<3){
            return arr[n-1];
    }else{
            return arr[n-3];
        }
    }
}