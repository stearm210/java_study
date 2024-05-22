package exercise3.Multithreading.Thread_Safety;

/*
* 账户中有10万元，模拟当有两个人同时取钱时的账户安全问题
* */


/**
 * @Author：stearm210
 * @Package：exercise3.Multithreading.Thread_Safety
 * @Project：study
 * @name：Account
 * @Date：22/5/2024 14:52
 * @Filename：Account
 */
public class Account {
    private double money;//余额
    private String cardId;//卡号

    public Account() {
    }

    public Account(String cardId,double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
