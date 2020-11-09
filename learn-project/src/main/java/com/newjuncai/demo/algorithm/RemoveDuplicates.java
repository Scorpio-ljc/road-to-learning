package com.newjuncai.demo.algorithm;

import java.util.*;

/**
 * 删除排序数组重复元素
 *  <p>
 *      https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/
 *  </p>
 *
 * @author liujc
 * @create 2020-10-20 13:28:32
 **/
public class RemoveDuplicates {
    public int solution(int[] nums){
        if(nums.length < 2){
            return nums.length;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(!(nums[i] == nums[count])){
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}
