package exercise1.API3;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //定义一个Integer对象
        Integer a2=Integer.valueOf(12);
        System.out.println(a2);

        //自动装箱机制,可以自动把基本类型的数据转换为对象
        Integer a3=12;

        //自动拆箱，可以自动把包装类型的对象转换成对应的基本数据类型
        int a4=a3;

        //泛型和集合不支持基本数据类型，只支持引用数据类型
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);//自动装箱机制，自动将类型从Integer转换为int类型
        list.add(13);

        //自动拆箱
        int rs=list.get(1);//自动拆箱。这里将Integer类型拆箱为int类型

        System.out.println("---------------");

        //1.将基本数据类型转换为字符串
        Integer a=23;
        String rs1=Integer.toString(a);
        System.out.println(rs1+1);//输出字符串231

        String rs2=a.toString();
        System.out.println(rs2+1);

        String rs3=a+"";
        System.out.println(rs3+1);

        System.out.println("---------------------");

        //2.把字符串类型的数值转换为对应的基本类型
        String ageStr="29";
        int age1=Integer.parseInt(ageStr);//字符串转换为数字
        System.out.println(age1+1);

        String scoreStr="99.4";
        double score=Double.parseDouble(scoreStr);
        System.out.println(score+0.5);

    }
}
