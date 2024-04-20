package exercise1.quote;

import exercise1.Arrays_Method.Student;

public class CompareByData {
    public static int compareByAge(Student o1,Student o2){
        //按照年龄升序的比较规则
        return o1.getAge()-o2.getAge();
    }

    public int compareByAgeDesc(Student o1,Student o2){
        return o2.getAge()-o1.getAge();//降序排序
    }
}
