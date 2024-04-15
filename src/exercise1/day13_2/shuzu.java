package exercise1.day13_2;

import java.util.ArrayList;
public class shuzu {
    public static void main(String[] args) {
        //这里定义了一个Integer类型(其实就是int类型)的ArrayList存储体
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}