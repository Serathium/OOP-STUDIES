public class Account {
    private static int amountOfAccounts;
    private int accountNumber;
    private String ownerName;
    private double balance;
    private double limit;

    // Constructors
    public Account( String ownerName, double balance, double limit ) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.limit = limit;
        amountOfAccounts++;
        this.accountNumber = amountOfAccounts;
    }

    public Account( String ownerName ) {
        this(ownerName, 0, 0);
    }

    // Methods
    public void deposit( double amount ) {
        setBalance(balance + amount);
    }

    public boolean withdrawal( double amount ) {
        if( amount <= ( balance + limit ) ) {
            setBalance(balance - amount);
            return true;
        }
        return false;
    }

    public boolean transfer( Account destination, double amount ) {
        if( withdrawal(amount) ) {
            destination.deposit(amount);
            return true;
        }
        return false;
    }

    public void printsData() {
        System.out.println( "Account number: " + getAccountNumber() );
        System.out.println( "Account owner: " + getOwnerName() );
        System.out.println( "Account balance: " + getBalance() );
        System.out.println( "Account limit: " + getLimit() );
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setAccountNumber( int accountNumber ) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName( String ownerName ) {
        this.ownerName = ownerName;
    }

    public void setBalance( double balance ) {
        this.balance = balance;
    }

    public void setLimit( double limit ) {
        this.limit = limit;
    }
    

    public static void main(String[] args) {
        Account account1 = new Account( "Maria Joaquina", 200, 500 );
        Account account2 = new Account( "Daniel Molo", 99999, 99999 );

        account1.printsData();
        System.out.println();
        account2.printsData();
        System.out.println();

        System.out.println("Accounts' initial balances: ");
        System.out.println( account1.ownerName + "'s balance: " + account1.getBalance() ); 
        System.out.println( account2.ownerName + "'s balance: " + account2.getBalance() ); 
        System.out.println();

        account1.deposit(150);
        account2.deposit(600);

        System.out.println("Accounts' balances after deposit: ");
        System.out.println( account1.ownerName + "'s balance: " + account1.getBalance() ); 
        System.out.println( account2.ownerName + "'s balance: " + account2.getBalance() ); 
        System.out.println();

        account1.withdrawal(200);
        account2.withdrawal(1200);

        System.out.println("Accounts' balances after withdrawal: ");
        System.out.println( account1.ownerName + "'s balance: " + account1.getBalance() ); 
        System.out.println( account2.ownerName + "'s balance: " + account2.getBalance() ); 
        System.out.println();

        account1.transfer(account2, 50);

        System.out.println("Accounts' balances after tranfer from " + account1.getOwnerName() + " to " + account2.getOwnerName() + ":");
        System.out.println( account1.ownerName + "'s balance: " + account1.getBalance() ); 
        System.out.println( account2.ownerName + "'s balance: " + account2.getBalance() ); 
        System.out.println();

        account1.printsData();
        System.out.println();
        account2.printsData();
        System.out.println();
    }

}