class Solution {

    public boolean check(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 7, 8, 9, 10};

        System.out.println(obj.check(nums));
    }
}
