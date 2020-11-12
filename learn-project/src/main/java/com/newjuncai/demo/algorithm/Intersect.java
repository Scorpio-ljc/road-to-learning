package com.newjuncai.demo.algorithm;


import java.util.*;
import java.util.stream.Collectors;

/**
 * 两个数组并集
 * <p>
 *     https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/
 * </p>
 * @author liujc
 * @create 2020-11-10 11:30:32
 **/
public class Intersect {
    public int[] solution(int[] nums1, int[] nums2) {
//        List<Integer> list = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums1.length; i++) {
//            for(int j = 0;j < nums2.length;j++){
//                if(nums1[i] == nums2[j]){
//                    boolean add = set.add(j);
//                    if(add){
//                        list.add(nums2[j]);
//                        break;
//                    }
//                }
//            }
//        }
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//        return result;
        //最佳解法
        if (nums1.length > nums2.length) {
            return solution(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
