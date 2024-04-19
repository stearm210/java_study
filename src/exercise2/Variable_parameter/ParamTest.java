package exercise2.Variable_parameter;

import java.util.Arrays;

public class ParamTest {
    public static void main(String[] args) {
         test();//不传数组
         test(10);//传输一个数组给他
        test(10,20,30);//传输多个数组给他
        test(new int[]{10,20,30,40});//传输一个数组给可变参数

    }

    //一个形参列表中只能定义一个可变参数
    //下面这个函数中只有一个可变参数
    //可变形参只允许放在其他参数的最后面
    public static void test(int...nums){
        //可变参数在方法内部使用
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));//输出数组的出来
        System.out.println("----------------------------");

    }

}
