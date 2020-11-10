package com.newjuncai.demo.algorithm;

/**
 * 只出现一次的数字
 * <p>
 * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x21ib6/
 * </p>
 * [4,1,2,1,2]
 *
 * @author liujc
 * @create 2020-11-10 09:50:59
 **/
public class SingleNumber {
    public static int solution(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j+1] > nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i++;
        }
        return 0;
        //最佳解法使用异域运算
        // 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
//        int single = 0;
//        for(int num : nums){
//            single ^= num;
//        }
//        return single;
    }

}
