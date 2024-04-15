package exercise1.API1;

public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这里只是将toString方法进行了重写罢了
    //其实重不重写主要看自己
    @Override
    public String toString() {
        return "Student{"+"name="+name+'\''+",age="+age+')';
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
}
