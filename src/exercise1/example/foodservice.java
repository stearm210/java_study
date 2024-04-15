package exercise1.example;

import java.util.ArrayList;
import java.util.Scanner;

public class foodservice {
    private ArrayList<food> foodlist=new ArrayList<>();

    public void addFood(){
        //创建菜品对象
        food f=new food();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入名字");
        String name=sc.next();
        f.setName(name);
        System.out.println("输入价格");
        double price=sc.nextDouble();
        f.setPrice(price);
        System.out.println("输入信息");
        String desc=sc.next();
        f.setDesc(desc);
        //对象操作完成之后，将对象加入arraylist中
        foodlist.add(f);
    }

    public void showAllfood(){
        for (int i = 0; i < foodlist.size(); i++) {
            food f=foodlist.get(1);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
        }
    }


}
