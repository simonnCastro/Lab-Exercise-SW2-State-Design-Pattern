public class ActiveState implements AccountState{
    public void deposit(Double depositAmount) {
        System.out.println("s");
    }

    public void withdraw(Double withdrawAmount) {
        System.out.println("s");
    }

    public void suspend(Account account) {
       account.setState(new SuspendedState());
    }

    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    public void close() {
        System.out.println("Account is suspended!");
    }
}
