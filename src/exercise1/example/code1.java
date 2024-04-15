package exercise1.example;

import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("输入用户名");
        String name=sc1.next();
        Scanner sc2=new Scanner(System.in);
        System.out.println("输入密码");
        String password=sc2.next();
        boolean a=hanshu1(name,password);
        if(a){
            System.out.println("yes");
        }else {
            System.out.println("na");
        }
    }
    public static boolean hanshu1(String a,String b) {
        String truename = "ni";
        String truepassword = "111";
        //这里无法使用等号进行比较，因为等号是比较地址的。
        //应该使用equal比较数值大小
        if (truename.equals(a) == truepassword.equals(b)) {
            return true;
        }else{
            return false;
        }
    }
}
