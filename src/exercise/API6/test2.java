package exercise.API6;

import java.util.HashMap;

public class test2 {
    public static void main(String[] args) {
        //键值对中的键与值不一定要一模一样
        //下面是一个简单的创建实例
        HashMap<Integer,String> Sites=new HashMap<Integer,String>();
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);//输出一个大列表一样的东西

        //访问对应编号下的元素
        //也就是说.get()方法是得到value值的意思
        System.out.println(Sites.get(3));

        //删除元素
        //删除时，选择对应键的编号进行删除
        System.out.println(Sites.remove(4));
        //同样，进行全部删除可以使用clear()方法
        //Sites.clear();

        //计算大小
        System.out.println(Sites.size());

        //重点，迭代问题
        //全部迭代建议写法
        //这个迭代本身的意思是循环输出编号
        for(Integer i : Sites.keySet()){
            System.out.println("key:"+i+",value:"+Sites.get(i));
        }
        //返回所有的value
        //这个迭代本身的意思是输出编号对应的值
        for(String value : Sites.values()){
            //这里是将每个value输出
            System.out.println(value+",");
        }
    }
}
