package exercise.API13;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        String[] names={"acc","Eee","bbb","ppp","Uop","Ddd"};
        //进行排序
//        Arrays.sort(names);

        //Comparator本身就是一个比较器对象，方便进行两个对象的调用
        //现在制定一个忽略字符大小的排序方法
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                //自己制定规则,string调用方法，使得调用者和被调用者忽略首字母大小进行排序
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

//        Arrays.sort(names,((o1, o2) -> o1.compareToIgnoreCase(o2)));

        //上面这个代码的简化
        Arrays.sort(names,String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
