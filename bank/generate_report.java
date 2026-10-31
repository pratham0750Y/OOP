public class generate_report
{
   account acc;
   generate_report(account acc)
   {
   this.acc=acc;
   }
   
   void generate()
   {
      System.out.println("account number="+ acc.acc_no);
      System.out.println("balance="+acc.balance);
   }
}