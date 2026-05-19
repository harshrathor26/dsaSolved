// Last updated: 5/19/2026, 1:19:26 PM
1import java.util.Arrays;
2
3class Solution {
4    public int threeSumClosest(int[] nums, int target) {
5        Arrays.sort(nums);
6        int ans = nums[0] + nums[1] + nums[2], n = nums.length;
7        for (int i = 0; i < n; i++) {
8            int comp = target - nums[i], j = i + 1, k = n - 1;
9            while (j < k) {
10                int curr = nums[j] + nums[k] + nums[i];
11                if (Math.abs(curr - target) < Math.abs(ans - target)) ans = curr;
12                if (nums[j] + nums[k] == comp) return ans;
13                else if (nums[j] + nums[k] > comp) k--;
14                else j++;
15            }
16        }
17        return ans;
18    }
19}