package exercises2_5;

public class TestMain {
    public static void main(String[] args) {

        Customer customer = new Customer(101, "A", 'm');
        Account account = new Account(1001, customer, 500.0);

        System.out.println(account);

        account.deposit(200.0);
        System.out.println(account);

        account.withdraw(300.0);
        System.out.println(account);

        account.withdraw(500.0);
    }
}
