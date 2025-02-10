public interface AccountState {
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);
    public void suspend(Account account);
    public void activate(Account account);
    public void close();
    //public String toString();
}
