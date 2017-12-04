public class abstract BankAccountDecorator implements IBankAccount {
    private IBankAccount _decorator;

    public BankAccountDecorator(BankAccountDecorator dec) {
        _decorator = dec;
    }

    public void withdraw(int amount) {
        _decorator.withdraw(amount);
    }

    public void deposit(int amount) {
        _decorator.deposit(amount);
    }

     public int getBalance() {
        return _decorator.getBalance();
    }
}