package exercise2.List;

import java.util.LinkedList;

//LinkList主要用于队列设计
public class LinkListTest1 {
    public static void main(String[] args) {
        //创建一个队列
        LinkedList<String> queue=new LinkedList<>();
        queue.addLast("a");
        queue.addLast("b");
        queue.addLast("c");
        queue.addLast("d");
        System.out.println(queue);

        //出队操作
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        //设计栈的操作
        //一般来说，使用栈操作时只需要使用其中一端进行操作
        LinkedList<String> stack=new LinkedList<>();
        //压栈
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);

        //出栈
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
