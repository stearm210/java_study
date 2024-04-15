package exercise1.day10_1;

import java.util.ArrayList;

public class StudentOperatormpl1 implements StudentOperator{
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("全部学生信息");
        for(int i=0;i<students.size();i++){
            //取出学生对象信息
            Student s=students.get(i);
            System.out.println("学生姓名"+s.getName()+",性别,"+s.getSex()+",成绩,"+s.getScore());
        }
        System.out.println("------------");
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        double allScore=0.0;
        for(int i=0;i<students.size();i++){
            Student s=students.get(i);
            allScore+=s.getScore();
        }
        System.out.println("平均分:"+(allScore)/students.size());
    }
}
