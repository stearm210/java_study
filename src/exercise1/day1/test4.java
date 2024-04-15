package exercise1.day1;
/**
 * this的作用主要是：当传入的参数名与类中的参数名一样时，使用this.功能可以代表是类中原本的参数名而不是传入的参数名。
 * */

public class test4 {
    public static void main(String[] args) {
        student s=new student();
        s.setScore(300);
        s.hanshu1(200);
    }
}
