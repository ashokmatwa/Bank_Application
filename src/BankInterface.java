public interface BankInterface {

    //functions
    double checkBalance();
    String addMoney(int amount);
    String withdrawnMoney(int amount, String  password);
    double calculateInterest(int year);
}
