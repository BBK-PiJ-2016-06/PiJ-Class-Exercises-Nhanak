public class Transaction implements Runnable {

  private BankAccount account;
  private int amount;
  private String action;

  public Transaction(int amount, BankAccount bankAccount, String action) {
    this.amount = amount;
    this.account = bankAccount;
    this.action = action;
  }

  public static void main(String[] args) {

    BankAccount myBankAcct = new BankAccount();

    for (int i = 0; i < 100; i++) {
      Thread t = new Thread(new Transaction(10, myBankAcct, "deposit"));
      System.out.println("Starting Thread: " + i);
      t.start();
      System.out.println("Balance is " + myBankAcct.getBalance());
    }
    System.out.println("Final balance is " + myBankAcct.getBalance());
  }


  public void deposit(BankAccount accountName) {
    accountName.deposit(amount);
  }

  public void withdraw(BankAccount accountName) {
    accountName.retrieve(amount);
  }

  public void run() {
    if (action.equals("deposit")) {
      deposit(account);
    } else if(action.equals("withdraw"))  {
      withdraw(account);
    } else if ( action.equals("get balance")) {
      System.out.println("$" + account.getBalance());
    } else {
      System.out.println("Not a valid action");
    }
  }


}
