import java.util.Date;

public class BankAccount {
    private String accNumber = " ";
    private double balance = 0;

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
    public String getAccNumber() {
        return accNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
class Checking extends BankAccount {
    double limit;
}
class Savings extends BankAccount {
    int tranfers;
}
class COD extends BankAccount {
    Date expiry;
}
