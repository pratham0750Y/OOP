abstract class Energy_source
{
   int id;
   String name;
   double Energy_generated;
   Energy_source(int id,String name,double Energy_generated)
   {
      this.id=id;
      this.name=name;
      this.Energy_generated=Energy_generated;
   }
     
     abstract double efficiency();
     
     void display()
     {
      System.out.println("id="+id+"\nname="+name+"\nenergy_generated="+Energy_generated);
     }
}
     
class solar extends Energy_source
{
   solar(int id,String name,double Energy_generated)
      {
         super(id,name,Energy_generated);
      }   
  double efficiency()
  {
  return (Energy_generated/5000)*100;
  }
  
 }     
     
class wind extends Energy_source
{
   wind(int id,String name,double Energy_generated)
      {
         super(id,name,Energy_generated);
      }   
  double efficiency()
  {
  return (Energy_generated/8000)*100;
  }
  
 }

public class energy
{
   public static void main(String args[])
   {
      solar s=new solar(12345,"solar",2000);
      
      s.display();
      System.out.println("efficiency="+s.efficiency());
      
      System.out.println();
      
      wind w=new wind(12345,"swind",6000);
      
      w.display();
      System.out.println("efficiency="+w.efficiency());
   }
}
