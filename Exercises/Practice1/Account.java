


public class Account {
    private int accountNumber;
    private String ownerName;
    private double balance;
    private double limit;

    public void deposit( double amount ) {
        this.balance = this.balance + amount;
    }

    public boolean withdrawal( double amount ) {
        if( amount <= ( balance + limit ) ) {
            balance = balance - amount;
            return true;
        } else {
            return false;
        }
    }

    public void transfer( Account destination, double amount ) {
        if( balance >= amount ) {
            balance = balance - amount;
            destination.balance = destination.balance + amount;
        } else {
            
        }
    }

    public void printsData() {
        System.out.println( "Account number: " + accountNumber );
        System.out.println( "Account owner: " + getOwnerName() );
        System.out.println( "Account balance: " + getBalance() );
        System.out.println( "Account limit: " + limit );
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
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
        Account account1 = new Account();
        Account account2 = new Account();

        account1.setAccountNumber(1234);
        account1.setOwnerName("Maria Joaquina");
        account1.setBalance(200);
        account1.setLimit(500);

        account2.setAccountNumber(777);
        account2.setOwnerName("Daniel Molo");
        account2.setBalance(99999);
        account2.setLimit(99999);

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