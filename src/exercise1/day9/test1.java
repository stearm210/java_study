package exercise1.day9;
/*
 * 1.抽象类的关键字是abstract，意思是抽象
 * 2.abstract修饰类，则为抽象类，修饰方法则为抽象方法
 * */

//修饰符 abstract class 类名{
//      修饰符 abstract返回值类型 方法名称(形参列表);
//

/*
 * 1.抽象类中不一定有抽象方法，有抽象方法的一定是抽象类
 * 2.类有的成员（成员变量、方法等）抽象类都有
 * 3.抽象类不能创建对象，只能作为父类让子类继承
 * 4.一个类继承抽象类，必须重写抽象类中的所有方法*/
public class test1 {
    public static void main(String[] args) {
        //抽象类无法创建对象
        //A a=new A();
    }
}
