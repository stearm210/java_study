package exercise1.API12;

//静态内部类实现方法
//进一步改进使得代码更紧凑，实现静态内部类，也就是将实现类放入主类中，会提示我们需要定义静态类
public class test2 {
    //2.静态内部类实现
    //使用静态类会使得每次运行必定会调用静态修饰的方法和类
    static class Addition implements MathOperation2{
        @Override
        public void operation(int a,int b){
            System.out.println(a+b);
        }
    }
    public static void main(String[] args) {
        //1.普通使用函数式接口
        Addition addition= new Addition();//新的接口实现类对象的创建
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation2{
    void operation(int a,int b);
}


