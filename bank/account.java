public class account
{
   int acc_no;
   double balance;
   
   account(int number,int bal)
   {
   acc_no=number;
   balance=bal;
   }
   void deposit(int amount)
   {
      balance+=amount;
      System.out.println("amount deposited:"+amount);
     }
     
     void withdraw(int amount)
     {
         if(balance >= amount)
         {
            balance-=amount;
            System.out.println("amount withdrawn:"+amount);
          }
          else
            System.out.println("Insufficient funds");
      }
}