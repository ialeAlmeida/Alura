public class BankAccount {
    private String numBankAccount;
    private double balance;

    public BankAccount(String numBankAccount, double balance){
        this.numBankAccount = numBankAccount;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numBankAccount + " , saldo: R$" + balance;
    }
}
