package exercise1.Lambda;

//普通接口与接口类实现方法
//正常情况下的实现加法函数计算，需要定义接口并实现类，再调用方法，在此基础上不断简化，去深入理解Lambda 表达式是如果做到的
//
//一般来说，使用接口会有对应的接口实现类来实现操作，主函数直接调用这个接口实现类即可
public class test1 {
    public static void main(String[] args) {
        Addition addition = new Addition();
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation1{
    void operation(int a,int b);
}
//定义一个接口实现类
//接口实现类implements这个接口，实现接口中函数的具体操作
class Addition implements MathOperation1{
    @Override
    public void operation(int a, int b) {
        System.out.println(a + b);
    }
}

