package exercise1.day10_1;

import java.util.ArrayList;

public class StudentOperatormpl2 implements StudentOperator{
    //打印全班学生的信息
    @Override
    public void printAllInfo(ArrayList<Student> students) {
        System.out.println("学生信息");
        int count1=0;//男生的信息
        int count2=0;//女生的信息
        for(int i=0;i<students.size();i++){
            Student s=new Student();
            //如果遍历得到男或者女的情况
            if(s.getSex()=='男'){
                count1+=1;
            }else{
                count2+=1;
            }
        }
        System.out.println("男生人数:"+count1+",女生人数是:"+count2);
        System.out.println("总人数是:"+(count2+count1));
    }

    @Override
    public void printAverageScore(ArrayList<Student> students) {
        //打印班级学生的平均分（除去最高最低分）
        double allScore=0.0;
        double max=students.get(0).getScore();
        double min=students.get(0).getScore();
        for(int i=0;i<students.size();i++){
            Student s=students.get(i);
            if(s.getScore()>max) max=s.getScore();
            if(s.getScore()<min) min=s.getScore();
            allScore+=s.getScore();
        }
        System.out.println("最高分:"+max);
        System.out.println("最低分:"+min);
        System.out.println("减去之后的品均分:"+(allScore-max-min)/(students.size()-2));
    }
}
