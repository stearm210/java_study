package exercise1.day13;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        //认识泛型
        ArrayList<String> list=new ArrayList<String>();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add("java4");
        for (int i = 0; i < list.size(); i++) {
            String a=list.get(i);
            System.out.println(a);
        }
    }

}
