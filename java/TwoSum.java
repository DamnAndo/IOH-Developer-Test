// two sum [ JAVA ]
// 18:00	18:30
// easy
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> dataTemp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sisa = target - nums[i];

            if (dataTemp.containsKey(sisa)) {
                return new int[] { dataTemp.get(sisa), i };
            }

            dataTemp.put(nums[i], i);
        }

        return new int[] {};
    }
}