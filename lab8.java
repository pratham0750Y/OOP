class BusReservation{
   boolean seatisavilable=true;
   
   synchronized void bookseat(String name)
   {
      if(seatisavilable){
      System.out.println(name+" is trying to book");
      
      try{
      Thread.sleep(100);
      }catch(Exception e){}
      
      seatisavilable=false;
      
      System.out.println(name+" successfully booked");
      }
      
      else
         System.out.println(name+" booking failed");
         
    }
      
}

class customer extends Thread{
   static BusReservation bus=new BusReservation();
   String name;
   
   customer(String name){
      super(name);
      this.name=name;
      }
      
      public void run(){
         bus.bookseat(name);
      }
      
 }
 
 public class threading{
   public static void main(String args[])
   {
   customer c1=new customer("customer 1");
   customer c2=new customer("customer 2");
   customer c3=new customer("customer 3");
   
   c1.start();
   c2.start();
   c3.start();
   }
}

   
