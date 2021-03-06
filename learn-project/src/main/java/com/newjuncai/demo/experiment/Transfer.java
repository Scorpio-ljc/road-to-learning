package com.newjuncai.demo.experiment;

/**
 * 值传递引用传递
 *
 * @author liujc
 * @create 2020-10-15 13:49:11
 **/
public class Transfer {
    public static void main(String[] args) {
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        swap(s1,s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());

    }
    public static void swap(Student x, Student y){
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }
    static class Student{
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
