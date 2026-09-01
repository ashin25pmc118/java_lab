class Transaction {

    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    public void displayTransaction() {
        System.out.println("\nTransaction Details");
        System.out.println("From Account : " + fromAccount);
        System.out.println("To Account   : " + toAccount);
        System.out.println("Amount       : " + amount);
        System.out.println("Status       : " + status);
    }
}

class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    static int accountCount = 0;

    public BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;

        accountCount++;
        accountNumber = accountCount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {

        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public Transaction transferTo(BankAccount target, double amount) {

        if (withdraw(amount)) {

            target.deposit(amount);

            return new Transaction(accountNumber,
                    target.accountNumber,
                    amount,
                    "Success");
        }

        return new Transaction(accountNumber,
                target.accountNumber,
                amount,
                "Failed");
    }

    public void display() {

        System.out.println("\nAccount Details");
        System.out.println("Name    : " + accountHolder);
        System.out.println("Account : " + accountNumber);
        System.out.println("Balance : " + balance);
    }

}

public class BankApp {

    public static void main(String args[]) {

        BankAccount a1 = new BankAccount("Ashin", 5000);
        BankAccount a2 = new BankAccount("Rahul", 3000);

        Transaction t1 = a1.transferTo(a2, 2000);
        Transaction t2 = a2.transferTo(a1, 10000);

        a1.display();
        a2.display();

        t1.displayTransaction();
        t2.displayTransaction();
    }
}