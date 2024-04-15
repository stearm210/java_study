package exercise1.day4;

import exercise1.day5.people;
import exercise1.day5.student;
import exercise1.day5.teacher;

public class zhuyao {
    public static void main(String[] args) {
        //父类调子类
        //走老师多态调用方法
        people p1=new teacher();
        p1.run();
        System.out.println(p1.name);
        //走学生多态调用方法
        people p2=new student();
        p2.run();
        System.out.println(p2.name);
        //但是，上面这种多态是对于方法才适用的
        //对于变量是不适用的
        //对于变量则会调用父类中的变量

        //多态的强制类型转换。
        //比如说：子类 变量名=（子类）父类变量
        //当使用强制类型装换时，可以调用子类中的独有方法
        //可以使用instanceof关键字进行类型强制装换的判断
    }
}
