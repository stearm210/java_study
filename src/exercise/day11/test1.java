package exercise.day11;

public class test1 {
    public static void main(String[] args) {
        //内部类调用外部类
        //这里是创建内部类的方法。先new Outer之后再.new Inter创建一个外部类。
        Outer.Inter in=new Outer().new Inter();
        in.test();
    }
}
