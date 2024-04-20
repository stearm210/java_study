package exercise1.Object_api;

//Cloneable是一个标记接口
//implements它是一个规则
public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private double[] scores;
    public User(){}

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //这里的super.clone()只是将之前的
        //u1克隆成了新的u2对象
        return super.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }
}
