public class bank
{
   public static void main(String args[])
     {
         account acc= new account(10235,50000);
         acc.deposit(10000);
         acc.withdraw(60000);
         generate_report rep=new generate_report(acc);
         rep.generate();
       }
}  