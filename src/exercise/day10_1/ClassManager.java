package exercise.day10_1;

import java.util.ArrayList;

public class ClassManager {
    //容器中装着学生对象。单扩折号里面放属性
    //外面放容器的名字
    private ArrayList<Student>students=new ArrayList<>();

    //调用接口的方法
    private StudentOperator studentOperator=new StudentOperatormpl1();

    public ClassManager(){
        //使用Student类创建一个new容器对象
        //调用add方法加入对象
        students.add(new Student("有益于",'女',90));
        students.add(new Student("xxx",'女',12));
        students.add(new Student("qqq",'女',23));
        students.add(new Student("aaa",'女',15));
    }
    //打印全班全部学生信息
    public void printInfo(){
        studentOperator.printAllInfo(students);
    }
    //打印全班全部学生平均成绩
    public void printScore(){
        studentOperator.printAverageScore(students);
    }
}
