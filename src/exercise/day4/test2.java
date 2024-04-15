package exercise.day4;
/*类变量和实例变量的区别、
1.类变量：有static修饰，属于类，只有一份，被类的所有对象共享。
一般类变量使用：类名.类变量 进行访问

2.实例变量：没有static修饰，属于每个变量。每个对象分别有一个，不是共享使用的。
* */
///
///使用类变量主要是方便记录构造了多少个类
public class test2 {
    public static void main(String[] args) {
        man m1=new man();
        man m2=new man();
        man m3=new man();
        man m4=new man();
        System.out.println(man.number);
        /*1.类方法只能用类进行访问
          2.实例方法只能用实例访问
          实例.实例方法
        * */
        ///类方法的访问
        man.printHelloWord();


        //静态代码块执行
        System.out.println(man.score);
        System.out.println(man.schoolName);
    }
}
