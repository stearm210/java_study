package exercise.day3;

public class test2 extends test1{
    String name="子类名称";
    public void cout(){
        System.out.println(i);
    }

    //方法重写
    //私有方法和静态方法都不能重写
    @Override
    public void print() {
        System.out.println("方法重写");
    }


    //就近原则与超类
    public void showname(){
        String name="局部名称";
        //如果输出是没有指定输出哪里的变量，则输出与之接近的
        //局部变量
        System.out.println(name);
        //使用this关键字用于访问此时子类中的变量
        System.out.println(this.name);
        //使用super用于访问父类此时的变量
        System.out.println(super.name);
    }

    //进行构造器调用时，一般先调用父类的构造器
    //然后再调用子类构造器
    //但是如果父类没有无参构造器时，子类全部构造器都会报错
    //因此，可以再子类中用super指定调用父类的有参构造器
    public test2(){
        //父类没有无参构造器时，则用super调用父类的有参构造器
        super(1);
    }

    //同时，如果在子类中没有对应变量比如所name和age时
    //而在父类中有对应变量name和age，这个时候在子类中
    //的有参构造器中不能使用this.name=name的方式进行初始化
    //因为子类中没有！！！！
    //这个时候可以使用super()将变量传入父类中的有参
    //构造器进行初始化赋值
}
