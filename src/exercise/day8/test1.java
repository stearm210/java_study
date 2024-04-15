package exercise.day8;

/*
* 1.final关键字是最终的意思，可以对（类、方法、变量）进行修饰
* 2.修饰类：此类为最终类，无法被继承
* 3.修饰方法：最终方法，无法被重写
* 4.修饰变量：此变量只能被赋值一次*/
public class test1 {
    public static final String SCHOOL_NAME="常量名字";
    public static void main(String[] args) {
        //3.final修饰变量，总规则是只能赋值一次
        final int a=10;
        //常量的访问
        System.out.println(SCHOOL_NAME);
    }
}

//1.修饰类
final class A{

}

//2.final修饰变量
class C{
    public final void test(){

    }
}
class B extends C{

}











