package exercise2.IO.Object_Stream;

//对象如果想进行序列化，就必须实现一个序列化接口

import java.io.Serializable;

/**
 * @Author：stearm210
 * @Package：exercise2.IO.Object_Stream
 * @Project：study
 * @name：User
 * @Date：8/5/2024 20:56
 * @Filename：User
 */

//实现一个序列化接口:Serializable
public class User implements Serializable {
    private String loginName;
    private String userName;

    public User() {
    }

    public User(String loginName, String userName, int age, String passWord) {
        this.loginName = loginName;
        this.userName = userName;
        this.age = age;
        this.passWord = passWord;
    }

    //如果再变量之前加上transient，这会使得这个变量不会参加序列化
    private int age;
    private String passWord;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
