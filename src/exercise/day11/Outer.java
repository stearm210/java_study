package exercise.day11;

public class Outer {
    //内部类age对象
    private int age=99;
    public static String a;
    public class Inter{

        private String name;
        public static String schoolName;
        //外部类age对象
        private int age=88;
        public void test(){
            System.out.println(age);//这里打印Inter类中的age
            System.out.println(a);
            int age=66;
            System.out.println(age);//这里打印66，即前面临时变量的age
            System.out.println(this.age);//this.age打印Inter的age
            System.out.println(Outer.this.age);//这里打印外部类的age
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
