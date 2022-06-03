class 1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++)
            {
                int n2 = target - nums[i];
                if (values.containsKey(n2))
                {
                    return new int[] { i, values.get(n2) };
                }
                values.put(nums[i], i);
            }
            return new int[] { -1, -1 };
    }
}