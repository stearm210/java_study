package exercise.API13;

import exercise.API11.Student;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        Student[] students=new Student[4];
        students[0]=new Student("a",197.3,90);
        students[1]=new Student("b",112.3,34);
        students[2]=new Student("c",123.3,46);
        students[3]=new Student("d",143.3,75);
//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();//按照年龄进行升序降序
//            }
//        });


        //使用Lambda表达式
       // Arrays.sort(students,((o1, o2) -> o1.getAge()- o2.getAge()));

        //初始调用
        //Arrays.sort(students,((o1, o2) -> CompareByData.compareByAge(o1,o2)));


        //静态方法的引用
        //使用Arrays对数组中的对象进行排序调用
        Arrays.sort(students,CompareByData::compareByAge);

        //实例方法的调用
        CompareByData compare=new CompareByData();
        //Arrays.sort(students,((o1, o2) -> compare.compareByAgeDesc(o1,o2)));
        Arrays.sort(students,compare::compareByAgeDesc);//实例方法的调用，降序方法

        System.out.println(Arrays.toString(students));
    }
}
