package exercise.day12;

public class test1 {
    public static void main(String[] args) {
        //测试
        //认识枚举
        A a1=A.X;
        System.out.println(a1);

        //枚举类中有一些方法可以进行使用
        A[] as=A.values();//拿到全部枚举对象
        A a3=A.valueOf("Y");
        System.out.println(a3.name());//获得枚举对象的名字
        System.out.println(a3.ordinal());//枚举对象的索引
    }
}
