public class SupervisionDecorator extends BankAccountDecorator {

    public SupervisionDecorator(BankAccountDecorator dec) {
        super(dec);
    }

    public void withdraw(int amount) {
        super.withdraw(amount);
        BankSupervision.register(this, false, amount);
    }

    public void deposit(int amount) {
        super.deposit(amount);
        BankSupervision.register(this, true, amount);
    }
}