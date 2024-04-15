package exercise.API11;

import java.util.Arrays;
import java.util.Comparator;

//当数组中存储的是对象，应该如何排序
//一般让该对象的类实现Comparable接口，之后重写
//compareTo方法，自己来制定比较规则
public class test2 {
    public static void main(String[] args) {
        Student[] students=new Student[4];
        students[0]=new Student("啊",190.9,23);
        students[1]=new Student("吧",132.1,24);
        students[2]=new Student("串",145.9,25);
        students[3]=new Student("的",129.9,26);
//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));


        ///第二种写法，当数组中是对象时，应该如何排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            //这里的compare传入两个对象进行比较
            public int compare(Student o1, Student o2) {
                //约定1：左边对象大于右边对象时，返回正整数
                //约定2：左边对象小于右边对象时，返回负整数、
                //约定3：左边对象等于右边对象时，返回0
                if(o1.getHeight()>o2.getHeight()){
                    return 1;
                }else if(o1.getHeight()<o2.getHeight()){
                    return -1;
                }
                return 0;


                ///或者上面可以简化写成:
                //return Double.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
