package exercise1.API11;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    //对继承的接口函数进行重写
    //重写方法中的写法是一种约定，进行对应的编写
    @Override
    public int compareTo(Student o){
        //左边对象大于右边对象，就返回正整数
        //左边对象小于右边对象时，就返回负整数
        if(this.age>o.age){
            return 1;
        }else if(this.age<o.age){
            return -1;
        }
        return 0;

        //升序的效果
        //return Double.compare(o1.getHeight(),o2.getHeight());
        //降序的效果
        //return Double.compare(o2.getHeight(),o1.getHeight());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(){

    }
    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
