package exercise2.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//如果在边循环边删除的项目背景下出现bug应该如何解决
//一般建议使用迭代器方法进行删除
//当然，如果使用for循环进行遍历，这个时候建议倒着进行遍历删除
public class ListBug {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("自子");
        list.add("开子");
        list.add("有子");
        System.out.println(list);

        /*//迭代器对集合中的元素进行遍历
        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            String name=it.next();
            if(name.contains("子")){
                list.remove(name);
            }
        }
        System.out.println(list);*/
        //上面的代码可能会报错

        //使用for循环进行名字的遍历
        /*for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if(name.contains("子")){
                list.remove(name);
            }
        }
        System.out.println(list);*/
        //但是这样子也会引发一个错误异常


        //一般建议使用迭代器进行删除
        //使用迭代器中的remove方法可能会更好操作
        Iterator<String> it= list.iterator();
        while (it.hasNext()){
            String name= it.next();
            if(name.contains("子")){
                it.remove();//删除一个元素之后自动进行后移一位的操作，不会出现bug
            }
        }
        System.out.println(list);
    }
}
