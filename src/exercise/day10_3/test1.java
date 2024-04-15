package exercise.day10_3;

public class test1 {
    public static void main(String[] args) {

    }
}
interface A{
    void caozuo1();
}
interface B{
    void caozuo2();
}
interface C{}

//接口的多继承
interface D extends C,B,A{

}

//这里的类通过继承一个接口实现多接口继承
class E implements D{
    @Override
    public void caozuo1() {

    }

    @Override
    public void caozuo2() {

    }
}



