package exercise.day13_2;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //泛型方法接String类型的方法
        //这里将java传入test函数之后
        //test会自动识别这是一个String类型变量。
        String rs=test("java");
        System.out.println(rs);

        //泛型方法接参数为Dog类的方法
        Dog d=test(new Dog());
        System.out.println(d);

        //泛型方法，用于接收汽车
        //这里使用一个ArrayList集合，用于将类型相同的Car放入ArrayList集合中
        //下面定义一个泛型，用于创建一个cars泛型
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BEN2());
        go(cars);

        //泛型方法，用于接收宝马
        //这里使用一个ArrayList集合，用于将类型相同的BMW放入ArrayList集合中
        ArrayList<BMW> bmws=new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        //泛型方法，用于接收奔驰
        //这里使用一个ArrayList集合，用于将类型相同的奔驰放入ArrayList集合中
        ArrayList<BEN2> bens=new ArrayList<>();
        bens.add(new BEN2());
        bens.add(new BEN2());
        go(bens);

        //这个时候，Dog类型就不能使用泛型操作了
//        ArrayList<Dog> dogs=new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);
    }

//这里是一个泛型方法，并且这个方法主要使用汽车继承。即只限定汽车使用，其他类型无法使用该泛型。
    public static <T extends Car> void go(ArrayList<T> cars){

    }

    //泛型方法
    public static <T> T test(T t){
        return t;
    }

}
