public class SuspendedState implements  AccountState {
    public void deposit(Double depositAmount) {

    }

    public void withdraw(Double withdrawAmount) {

    }

    public void suspend(Account account) {
        System.out.println("Acount is already is suspended");
    }

    public void activate(Account account) {
        System.out.println("Activated");
        account.setState(new ActiveState());
    }

    public void close() {
        System.out.println("Account is closed!");
    }
}