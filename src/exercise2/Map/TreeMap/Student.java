package exercise2.Map.TreeMap;

import java.util.Objects;

//如果要TreeMap实现排序，则需要实现一个Comparable接口
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private double height;

    //实现比较，通过对象传进来
    //this o两个对象
    @Override
    public int compareTo(Student o) {
        return this.age-o.age;//年龄的升序排序
    }

    //这里的hashCode方法和equals方法可以保证键的唯一
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(height, student.height) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }

    public Student(){

    }
    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
