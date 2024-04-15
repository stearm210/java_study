package exercise.day1;

public class student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private int score;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public student(){
        System.out.println("输出无参构造器");
    }
    public student(String a,int b){
        this.age=b;//使用this进行初始化操作
        this.name=a;
        System.out.println("输出有参构造器");
        //有参构造器方便初始化
    }

    public void cout(){
        System.out.println(this);
    }
    public void shuchu(int k){
        if(this.age>k){//this变量用于指向当前主类中调用的对象的age
            System.out.println("yes");
        }
    }
    public void hanshu1(int score){
        if(this.score>score){
            System.out.println("成功输出");
        }else{
            System.out.println("失败");
        }
    }
}
