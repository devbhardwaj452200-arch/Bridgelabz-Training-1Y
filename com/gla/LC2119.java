package com.gla;
public class LC2119 {
    // Function from LeetCode
        public static boolean isSameAfterReversals(int num) {
            return num == 0 || num % 10 != 0;
        }

        public static void main(String[] args) {
            // Test cases
            int[] testCases = {526, 1800, 0, 10, 101};

            for (int num : testCases) {
                boolean result = isSameAfterReversals(num);
                System.out.println("Input: " + num + " -> Output: " + result);
            }
        }
    }
