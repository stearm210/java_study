package exercise1.Lambda;

//局部内部类
//可是静态内部类还是太繁琐了，如果把它放进方法里面呢？由此引出局部内部类，即在一个方法中定义的内部类，这时就不用定义静态类了
public class test3 {
    public static void main(String[] args) {
        //主函数内部定义类implements接口，实现函数的重写
        class Addition implements MathOperation3{
            @Override
            public void operation(int a,int b){
                System.out.println(a+b);
            }
        }
        Addition addition=new Addition();//新的接口实现类对象的创建
        addition.operation(1,2);
    }
}

//定义一个函数式接口
interface MathOperation3{
    void operation(int a,int b);
}
