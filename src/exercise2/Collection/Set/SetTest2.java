package exercise2.Collection.Set;

public class SetTest2 {
    public static void main(String[] args) {
        Student s1=new Student("a",12,129);
        Student s2=new Student("b",13,139);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String str1=new String("abc");
        String str2=new String("acD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}








