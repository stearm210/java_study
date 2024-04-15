package exercise.day4;

public class man {
    //静态代码块
    static int score=80;
    static String schoolName;
    //静态代码块会自动执行，注意
    //静态代码块
    static{
        System.out.println("静态代码块执行");
        schoolName="黑马";
    }

    //实例代码块：
    {
        System.out.println("实例代码块的执行");
    }
    /*
    * 实例代码块：每次创建对象时，会执行实例代码块，并在构造器之前执行。
    * 与构造器一样，主要用于完成对象的初始化。*/
    /*
    * 一般来说，优先静态代码块执行，之后才是实例代码块执行。*/




    //定义类变量，使用public类型进行暴露
    public static int number;
    //构造器，如果有进行过对象构造的话，就会+1
    public man(){
        man.number++;
    }

    ///类方法，也是使用：类名.方法进行操作
    public static void printHelloWord(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

}
