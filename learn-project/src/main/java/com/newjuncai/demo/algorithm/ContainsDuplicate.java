package com.newjuncai.demo.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复数
 * <p>
 *     https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x248f5/
 * </p>
 * @author liujc
 * @create 2020-11-09 15:54:03
 **/
public class ContainsDuplicate {
    public boolean solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int item : nums) {
            boolean add = set.add(item);
            if(!add){
                return true;
            }
        }
        return false;
    }
}
