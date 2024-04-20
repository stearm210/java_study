package exercise1.Object_class;

import java.util.Objects;

public class test1 {
    public static void main(String[] args) {
        String s1="kkk";
        String s2="iii";
        String s3=null;
        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1,s2));//建议使用这个方法

        //判断是否为null
        System.out.println(Objects.isNull(s1));
    }
}
