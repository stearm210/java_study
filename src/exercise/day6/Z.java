package exercise.day6;

public class Z extends F{
    String name="子类名称";

    public Z(){
        System.out.println("子类的无参构造器");
    }

    public Z(String name){
        System.out.println("子类的有参构造器");
    }
    public void showName(){
        //访问的就近原则
        String name="局部名称";
        System.out.println(name);//输出局部名称
        System.out.println(this.name);//子类成员变量
        System.out.println(super.name);//访问父类

    }

    //方法重写
    @Override
    public void print1(){
        System.out.println("子类的print1方法执行");
    }

    public void showMethod(){
        print1();//就近原则访问
        super.print1();//使用super访问父类方法
    }

}
