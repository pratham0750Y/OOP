import java.util.*;
class stringfunc
{
   public static void main(String args[])
   {
      Scanner obj=new Scanner(System.in);
      String validdomain="@bmsce.ac.in";
      
      System.out.print("enter email address:");
      String email=obj.nextLine();

      System.out.println("Length:"+email.length());
      
      int pos=email.indexOf('@');
      String username=email.substring(0,pos);
      System.out.println("username:"+username);
      
      String domain=email.substring(pos+1);    
      System.out.println("domain:"+domain);
      
      if(domain.equals(validdomain))
         System.out.println("belongs to BMSCE");
      else
         System.out.println("does not belong to BMSCE");
      
      String lower=email.toLowerCase();
      System.out.println("Lower:"+lower);
      
      System.out.print("\nenter prefix to check:");
      String prefix=obj.nextLine();
      
      if(email.startsWith(prefix))
         System.out.println("Email starts with given prefix");
      else
         System.out.println("Email does not starts with given prefix");
         
      if(email.endsWith(validdomain))
         System.out.println("Email ends with valid domain");
      else
         System.out.println("Email does not end with valid domain");
         
      String updated=email.replace(validdomain,".cse"+validdomain);
      System.out.println("updated email:"+updated);
      
      System.out.print("\nenter a sequence to search:");
      String sequence=obj.nextLine();
      
      if(email.contains(sequence))
         System.out.println("sequence found");
      else
         System.out.println("sequence not found");
         
      String trimmed=email.trim();
      System.out.println("Trimmed email:"+trimmed);
      
      System.out.print("\nenter another email address:");
      String email2=obj.nextLine();
      
      if(email.equalsIgnoreCase(email2))
         System.out.println("both email are same");
      else
         System.out.println("email address are different");
      }
}
      
         
