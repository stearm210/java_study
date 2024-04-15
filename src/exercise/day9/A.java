package exercise.day9;
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


//抽象类
public abstract class A {
    //抽象方法用abstract修饰，且一定没有方法体，也就是说只有一个壳子。
    private String name;
    public static String schoolName;

    //抽象类中的方法没有方法体，方便子类对父类是抽象类时进行方法的重写。
    public abstract void run();

    public A() {
    }
    public A(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
