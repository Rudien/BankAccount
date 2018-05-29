import java.text.*;

public class RunBank {
    public static void main(String[] args) {

        Checking checking = new Checking();
        Savings savings = new Savings();
        COD cod = new COD();

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccNumber("123456789");
        String accNumber = bankAccount.getAccNumber();
        System.out.println("accountnumber: " + accNumber);

        bankAccount.setBalance(100000.00);
        double balance = bankAccount.getBalance();
        DecimalFormat decFor = new DecimalFormat("0.00");
        System.out.println("balance: NOK " + decFor.format(balance));
    }


}
