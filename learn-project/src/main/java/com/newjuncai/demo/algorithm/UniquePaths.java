package com.newjuncai.demo.algorithm;

/**
 * 不同路径
 * <p>
 * https://leetcode-cn.com/problems/unique-paths/
 *
 * @author liujc
 * @create 2020-10-19 20:37:29
 **/
public class UniquePaths {
    public static int solution(int m, int n) {
        if (m == 0 && n > 0) {
            return n - 1;
        } else if (n == 0 && m > 0) {
            return m - 1;
        }
        //地图数组
        int[][] stepArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            stepArray[i][0] = 1;
        }
        for(int i = 0;i < n;i++){
            stepArray[0][i] = 1;
        }
        for(int i = 1;i < m; i++){
            for(int j = 1;j < n;j++){
                stepArray[i][j] = stepArray[i-1][j] + stepArray[i][j-1];
            }
        }
        return stepArray[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(solution(3,3));
    }


}
