package exercise2.Exception_handling;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //使用ctrl+alt+t 实现循环、try-catch快捷键选择
        while (true) {
            try {
                System.out.println(getMoney());
            } catch (Exception e) {
                System.out.println("请输入合法的数字");
            }
        }
    }
    public static double getMoney(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("输入合适的价格");
            double money=sc.nextDouble();
            if(money>=0){
                return money;
            }else {
                System.out.println("输入的不合理");
            }
        }

    }
}
