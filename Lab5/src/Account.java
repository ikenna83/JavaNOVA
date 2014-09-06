//the class for describing an account
public class Account{
   //two data fields in an account
   private int id;
   private double balance;

   //construct an account with specified id and balance
   public Account(int id, double balance){
      this.id = id;
      this.balance = balance;
   }
   //return id
   public int getId(){
      return id;
   }
   //set balance
   public void setBalance(double balance){
      this.balance = balance;
   }
   //return balance
   public double getBalance(){
      return balance;
   }
   //deposit an amount to this account
   public void deposit(double amount)
      throws NegativeAmountException 
      {
      if (amount < 0)
         throw new NegativeAmountException
            (this,amount,"deposit", null);
         balance = balance + amount;
   }

   //withdraw an amount from the account
   public void withdraw(double amount)
      throws NegativeAmountException, InsufficientFundException 
      {
         if(amount < 0)
         {
            throw new NegativeAmountException
               (this,amount,"withdraw", null);
         }
         else
        	 if(amount>balance)
        	 {
        		 throw new InsufficientFundException
                 (this,amount,"withdraw", null);
        	 }
         balance = balance - amount;

         
   }
}




