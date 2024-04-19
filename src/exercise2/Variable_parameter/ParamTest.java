package exercise2.Variable_parameter;

public class ParamTest {
    public static void main(String[] args) {
         test();//不传数组
         test(10);//传输一个数组给他
        test(10,20,30);//传输多个数组给他
        test(new int[]{10,20,30,40});//传输一个数组给可变参数

    }

    public static void test(int...nums){
        //可变参数在方法内部使用
        System.out.println(nums.length);
    }

}
