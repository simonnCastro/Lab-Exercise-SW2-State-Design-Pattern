public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState = new ActiveState();
    }
    public AccountState getState() {
        return accountState;
    }

    public void setState(AccountState accountState) {
        this.accountState = accountState;
    }


}
