// Last updated: 5/6/2026, 12:02:47 AM
class Solution {
    /**
     * Given an array of integers nums sorted in non-decreasing order, find the
     * starting and ending position of a given target value.
     * If target is not found in the array, return [-1, -1].
     * You must write an algorithm with O(log n) runtime complexity.
     *
     * @param nums   the sorted array of integers
     * @param target the target value to find
     * @return an array containing the starting and ending position of the target,
     * or [-1, -1] if the target is not found.
     */
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent potential overflow
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1; // Continue searching in the left half for the first occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevent potential overflow
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1; // Continue searching in the right half for the last occurrence
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Example 1: [" + result1[0] + ", " + result1[1] + "]"); // Output: [3, 4]

        // Example 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Example 2: [" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

        // Example 3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Example 3: [" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]

        // Example with single element
        int[] nums4 = {5};
        int target4 = 5;
        int[] result4 = solution.searchRange(nums4, target4);
        System.out.println("Example 4: [" + result4[0] + ", " + result4[1] + "]"); // Output: [0, 0]

        // Example with target at the beginning and end
        int[] nums5 = {1, 2, 2, 2, 3};
        int target5 = 2;
        int[] result5 = solution.searchRange(nums5, target5);
        System.out.println("Example 5: [" + result5[0] + ", " + result5[1] + "]"); // Output: [1, 3]
    }
}