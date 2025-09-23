  
# Object Oriented Programming: Classes Definition  

## Creating a Type  

- Considering a program for a bank, an important entity is the account. So let's create a class to represent the "Account" model.

- What does every account has that is important? (Attributes)  

- What can we do with an account? (Methods)  

## A Class in Java  

```java  
package banksystem;
public class Account {
    //attributes
    int number;
    String owner;
    double balance;
    double limit;

    //methods
    void deposit(double amount){
        this.balance = this.balance + amount;
    }

    void withdraw(double amount){
        double novoSaldo = this.saldo - amount;
        this.saldo = novoSaldo
    }
}
```  

## Using The Class  

```java  
package banksystem;
public class BankSystem{
    public static void main(String[] args){
        Account myAccount;
        myAccount = new Account();
        myAccount.owner = "Mary";
        myAccount.balance = 1000.0;
        System.out.println("Current balance: " + myAccount.balance)
    }
}

```

