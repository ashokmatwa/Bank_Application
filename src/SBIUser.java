import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {

    // attributes --> getter & setter
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        // bank initializing
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());
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
                return "Insufficient money";
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


    public String transferMoney(int amount, String enteredPassword, HDFCUser user2) {
        if(Objects.equals(enteredPassword, password)){
            if(amount > balance)
                return "Insufficient money";
            else{
                balance = balance - amount;
                System.out.println(balance);
                System.out.println(user2.addMoney(amount));
                return "andha paisa";
            }
        }
        else{
            return "wrong password";
        }
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
