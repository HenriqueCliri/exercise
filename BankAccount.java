public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount){
        this.amount = initialAmount;
    }

    public void Deposit(double value) {
        if(value > 0){
            this.amount += value;
        }
    }


    public boolean Withdraw(double value) {
        if(value > 0 && value <= this.amount) {
            this.amount -= value;
            return true;
        }
        return false;
    }

    public boolean TransferTo(BankAccount destination, double value) {
        if(this.Withdraw(value)) {
            destination.Deposit(value);
            return true;
        }
        return false;
    }

    public double GetAmount() {
        return amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(540);

        account1.TransferTo(account2, 300);
        
        System.out.println("account 1: " + account1.GetAmount());
        System.out.println("account 2: " + account2.GetAmount());
    }
}
