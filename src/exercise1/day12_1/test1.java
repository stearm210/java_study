package exercise1.day12_1;

public class test1 {
    //掌握枚举的应用场景

    public static void main(String[] args) {
        //check(1);
        check(Constant.BOY);
    }
    //传入的参数是另一个类中的变量
    //这个传入的参数类型是枚举类的类名
    public static void check(Constant sex){
        switch (sex){
            case BOY:
                System.out.println("展示信息1");
                break;
            case GIRL:
                System.out.println("展示信息2");
                break;
        }
    }
}
