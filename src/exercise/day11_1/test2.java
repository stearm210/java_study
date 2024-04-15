package exercise.day11_1;

public class test2 {
    public static void main(String[] args) {
        //匿名内部类，可以用作接口的实现类
        //下面的匿名接口实现类用于实现狗对象

        //这里创建一个接口的对象用于接收匿名内部类对象
        Swimming s1=new Swimming(){
            @Override
            public void swim(){
                System.out.println("狗很快");
            }
        };
        go(s1);

        //下面这种情况的匿名内部类十分常见
//        go(new Swimming(){
//            @Override
//            public void swim(){
//                System.out.println("狗很快");
//            }
//        });

    }

    //设计一个方法接收Swimming接口的一切对象参加比赛
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
    }
}

//猫和狗必须参加游泳比赛
interface Swimming{
    void swim();
}







