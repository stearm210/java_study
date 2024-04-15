package exercise1.day11_1;

public class test1 {
    public static void main(String[] args) {
//        Animal a=new cat();
//        a.cry();

        //匿名内部类
        //1.匿名内部类会被编译成一个子类，之后会创建一个子类对象出来
        //下面这段代码其实就是这个抽象类创建一个新的子类过程
        Animal a=new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }

}

class cat extends Animal{
    @Override
    public void cry(){
        System.out.println("喵喵喵");
    }
}

abstract class Animal{
    public abstract void cry();
}














