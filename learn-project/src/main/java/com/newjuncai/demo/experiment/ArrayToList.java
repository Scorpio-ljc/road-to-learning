package com.newjuncai.demo.experiment;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合
 *
 * @author liujc
 * @create 2020-10-21 11:48:52
 **/
public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"张三","李四"};
        List<String> list = Arrays.asList(array);
        //修改原始数组list中的对应值也会发送变化
        array[0] = "王五";
        System.out.println(list.get(0));//输出：王五
        //下面这句会报 java.lang.UnsupportedOperationException
        list.add("赵六");

    }
}
