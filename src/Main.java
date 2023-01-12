import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name, password, balance to create account");

        //create user
        String name = sc.next();
        String password = sc.next();
        double balance = sc.nextDouble();
        SBIUser user = new SBIUser(name, balance, password);
        System.out.println("accoutn no : "+user.getAccountNo());

        //add money
        String message = user.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("enter amount to withdraw");
        int money = sc.nextInt();
        System.out.println("enter your password");
        String pass = sc.next();
        System.out.println(user.withdrawnMoney(money, pass));

        System.out.println("remaining paisa : "+user.checkBalance());
        /* rate of interest */
        System.out.println("rate of interest for 10 years : "+user.calculateInterest(10));

        HDFCUser user2 = new HDFCUser(name, balance, password);
    }
}