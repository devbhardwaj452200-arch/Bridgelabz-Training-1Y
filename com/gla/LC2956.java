package com.gla;

public class LC2956 {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int cnt1 = 0;
        int cnt2 = 0;

        // Count elements of nums1 present in nums2
        for (int value : nums1) {
            for (int k : nums2) {
                if (value == k) {
                    cnt1++;
                    break;
                }
            }
        }

        // Count elements of nums2 present in nums1
        for (int k : nums2) {
            for (int i : nums1) {
                if (k == i) {
                    cnt2++;
                    break;
                }
            }
        }

        return new int[]{cnt1, cnt2};
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        int[] result = findIntersectionValues(nums1, nums2);

        System.out.println("Answer: [" + result[0] + ", " + result[1] + "]");
    }
}
