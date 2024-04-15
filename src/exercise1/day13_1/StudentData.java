package exercise1.day13_1;

import java.util.ArrayList;

//操作学生泛型接口方法。如果需要对学生进行操作，就需要将学生作为参数放在<>中
public class StudentData implements Data<Student>{
    @Override
    public void add(Student student) {

    }
    @Override
    public ArrayList<Student> getByName(String name) {
        return null;
    }
}
