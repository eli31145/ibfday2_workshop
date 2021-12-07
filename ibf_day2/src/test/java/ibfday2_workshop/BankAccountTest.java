package ibfday2_workshop;

import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testGetBalance(){
         BankAccount account = new BankAccount("John Smith", 123.45f);
         assertTrue(account.getAccountBalance() == 123.45f);
         System.out.println("testGetBalance successful");
    }
    @Test
    public void testDeposit(){
        BankAccount account = new BankAccount("John Smith", 12.34f);
        account.deposit(0.35f);
        assertTrue(account.getAccountBalance() == 14.81f);
        System.out.println("testDeposit successful");
    }



}
