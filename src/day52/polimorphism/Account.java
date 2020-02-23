package day52.polimorphism;

public class Account implements Transferable ,Comparable<Account>{

    //   Account implements Transferable ,Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }



    @Override
    public void transferAll(Account otherAccount) {
        balance += otherAccount.balance;
    }

    @Override
    public int compareTo(Account otherAccount) {
        if (this.balance > otherAccount.balance) {
            return 1;
        } else if (this.balance == otherAccount.balance) {
            return 0;
        } else {
            return -1;
        }
    }



    }
