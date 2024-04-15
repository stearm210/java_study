package exercise1.day2;

public class test3 {
    static int number=90;
    //静态代码块每次都会执行一次
    static {
        System.out.println("静态代码块执行");
    }

    //实例代码块
    //只有每次创建对象时都会执行实例代码块，并在构造器之前执行
    {
        System.out.println("实例代码块执行");
    }
    public test3(){
        System.out.println("这是无参构造器");
    }

}
