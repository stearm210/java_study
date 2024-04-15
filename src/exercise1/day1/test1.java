package exercise1.day1;
import java.util.Random;
public class test1 {
    public static void main(String[]args){
        Random r=new Random();
        int c=r.nextInt(10);//0~9之间的随机数
        int d=r.nextInt(10)+3;
        System.out.println(c);
    }
}
