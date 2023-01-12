public interface BankInterface {

    //functions
    double checkBalance();
    String addMoney(int amount);
    String withdrawnMoney(int amount, String  password);
    double calculateInterest(int years);

    //String transferMoney(int amount, String password, User);
    //String pinChange(String password);   --> require database
    //String statement(String password);

}
