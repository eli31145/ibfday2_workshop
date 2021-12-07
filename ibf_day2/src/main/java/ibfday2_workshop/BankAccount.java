package ibfday2_workshop;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    

    private String name;
    private String accountNumber;
    private float accountBalance;
    private List<String> transactions;
    private boolean closed;
    private String accountCreateDate;
    private String accountClosedDate;

    public BankAccount(String name, float accountBalance){
        this.name = name;
    }

    public BankAccount(String name) {
       this.name = name;
       this.accountBalance = 0f;
       this.accountNumber = Integer.toString((int)(Math.random()*1000000000));
       transactions = new ArrayList<>();
    }
    

    }
    
    }
    public String getName() {
        return name;
    }

    public void setAccountClosedDate(String){
        this.accountClosedDate = accountClosedDate;
    }


    public void deposit(float amount) {

        if (amount <0 || closed)
        throw new IllegalArgumentException();
        String transaction = "Deposit " + amount + " at " Calendar.getInstance().getTimeInMillis(); 
        transactions.add(transaction);
        this.accountBalance += amount;
    }

    public void withdraw(float amount) {
        if (amount <0 || amount > this.accountBalance || closed)
        String transaction = "Withdraw " + amount + " at " Calendar.getInstance().getTimeInMillis(); 
        transactions.add(transaction);
        this.accountBalance -= amount;
    }


}
