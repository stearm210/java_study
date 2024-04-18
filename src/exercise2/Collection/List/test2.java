package exercise2.Collection.List;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("google");
        arr.add("Runoob");
        arr.add("Taobao");
        arr.add("Weibo");
        System.out.println(arr);

        //访问元素
        System.out.println(arr.get(1));

        //修改元素
        arr.set(2,"wiki");
        System.out.println(arr);

        //删除元素
        arr.remove(3);
        System.out.println(arr);

        //计算大小
        System.out.println(arr.size());

    }
}
