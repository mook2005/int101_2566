package work04;

public class BankAccount {
    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            return balance -= amount;
        }
        else {
            System.out.println("Error! You do not have enough balance to withdraw");
            return balance;
        }
    }

    public void transfer(double amount, BankAccount account){
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount(" + owner.getId() + ")";
    }

}
