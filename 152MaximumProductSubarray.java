class 152MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int ans= nums[0], curr_max= nums[0], curr_min = nums[0],prev_max= nums[0] ,prev_min = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            curr_max = Math.max(prev_max*nums[i], Math.max(prev_min*nums[i], nums[i]));
            curr_min = Math.min(prev_max*nums[i], Math.min(prev_min*nums[i], nums[i]));
            ans = Math.max(ans, curr_max);
            prev_max = curr_max;
            prev_min = curr_min;
            // System.out.println(curr_max+","+ curr_min+","+ ans+","+prev_max +","+prev_min);
        }
        return ans;
    }
}
