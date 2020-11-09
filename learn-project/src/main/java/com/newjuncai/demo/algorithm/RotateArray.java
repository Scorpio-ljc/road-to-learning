package com.newjuncai.demo.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 旋转数组
 * <p>
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * </p>
 * <p>
 * nums = [1,2,3,4,5,6,7] k = 2
 *        [6,7,1,2,3,4,5]
 * result ==> [6,7,1,2,3,4,5]
 * </p>
 *
 * @author liujc
 * @create 2020-11-09 11:20:41
 **/
public class RotateArray {
    public static void solution(int[] nums, int k) {
        //向右移动位数
        k = k % nums.length;
        Map<Integer, Integer> oldMap = new HashMap<>();
        int index = k;
        for (int i = 0; i < nums.length; i++) {
            oldMap.put(i, nums[i]);
            if (k > 0 && i <= k - 1) {
                nums[i] = nums[nums.length - index];
                index--;
            } else {
                nums[i] = oldMap.get(i - k);
            }
        }
//        int temp, previous;
//        for (int i = 0; i < k; i++) {
//            previous = nums[nums.length - 1];
//            for (int j = 0; j < nums.length; j++) {
//                temp = nums[j];
//                nums[j] = previous;
//                previous = temp;
//            }
//        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution(nums, 2);
    }
}
