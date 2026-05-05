// Last updated: 5/6/2026, 12:02:52 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> rez = new ArrayList<>();

        int len = nums.length;

        for (int i = 0; i < len - 2; i++) {

            int iNum = nums[i];

            if (i > 0 && iNum == nums[i - 1] || iNum + nums[len - 2] + nums[len - 1] < 0) {
                continue;
            }

            if (iNum > 0 || iNum + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }

            int j = i + 1;
            int k = len - 1;

            while (j < k) {
                int sum = iNum + nums[j] + nums[k];
                if (sum == 0) {

                    rez.add(List.of(iNum, nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return rez;
    }
}