class 26RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int index = 0, len = nums.length;
        for(int i = 0; i<len;){
            int j =i+1;
            while(j<len && nums[i] == nums[j]) j++;
            nums[index++] = nums[i];
            i = j;
            
        }
        return index;
        
    }
}
