import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface {

    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public HDFCUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        // bank initializing
        this.rateOfInterest = 4.5;
        this.accountNo = String.valueOf(UUID.randomUUID());  // int --> string
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "updated balance : "+balance;
    }

    @Override
    public String withdrawnMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword, password)){
            if(amount > balance)
                return "insufficient amount";
            else{
                balance = balance - amount;
                return "andha paisa";
            }
        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
