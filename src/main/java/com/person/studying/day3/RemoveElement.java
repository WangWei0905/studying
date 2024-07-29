package com.person.studying.day3;

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args)
    {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, val));
    }
}