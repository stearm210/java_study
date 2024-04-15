package exercise1.day13_1;

import java.util.ArrayList;

//泛型接口
//Data中的
public interface Data<T> {
    void add(T t);
    ArrayList<T> getByName(String name);
}
