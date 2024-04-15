package exercise.API6;

import java.util.HashSet;

public class test1 {
    public static void main(String[] args) {
        //基本创建方法
        HashSet<String> has=new HashSet<String>();
        has.add("Google");
        has.add("Runoob");
        has.add("Taobao");
        has.add("Zhihu");
        has.add("Runoob");//重复的元素不会被添加
        System.out.println(has);//输出的仍然是列表形式

        //删除
        has.remove("Taobao");//对应名字删除
        //删除所有元素
        //has.clear();

        //计算大小
        System.out.println(has.size());

        //迭代HashSet
        //循环进行迭代
        //这个循环中，i被代指HashSet中的元素，has被代指HashSet
        //其实has就是需要被进行迭代的那个部分
        //最终的输出是HasSet中的i元素
        for(String i : has){
            System.out.println(i);
        }
    }
}
