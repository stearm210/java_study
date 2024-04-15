package exercise1.day10;

public class test2 {
    public static void main(String[] args) {

    }
}

//接口可以弥补单继承的不足，使得可以通过
//重写接口的抽象方法进行更多操作
class E extends Student implements  Driver,Singer{
    @Override
    public void drive() {

    }
    @Override
    public void sing() {

    }
}
class Student{

}
interface Driver{
    void drive();
}
interface Singer{
    void sing();
}











