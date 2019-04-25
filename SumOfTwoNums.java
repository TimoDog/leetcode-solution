class SumOfTwoNums {
    public int[] twoSum(int[] nums, int target) {
        int size = 2;
        int[] index = new int[size];
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[j]==target-nums[i]){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
}