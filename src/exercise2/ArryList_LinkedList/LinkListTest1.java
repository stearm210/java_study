package exercise2.ArryList_LinkedList;

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
    }
}
