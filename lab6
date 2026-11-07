import java.util.*;

class SeatAlreadyBookedException extends Exception
{
   SeatAlreadyBookedException(String message)
   {
      super(message);
   }
}

class reservation
{
   private boolean[] seats=new boolean[10];
   
   void reserveseat(int seatNumber) throws SeatAlreadyBookedException
   {
      if(seatNumber<1||seatNumber>seats.length)
         throw new IllegalArgumentException("Seat number:"+seatNumber+" doesn't exist");
      if(seats[seatNumber-1])
        throw new SeatAlreadyBookedException("seat number:"+seatNumber+" already taken");
      seats[seatNumber-1]=true;
      System.out.println("Seat number:"+seatNumber+" has been booked");
   }
}

public class railway
{
   public static void main(String args[])
   {
      reservation r=new reservation();
      Scanner obj=new Scanner(System.in);
      while(true)
      {
      System.out.println("enter a seat number between 1-10 to book");
      
      try{
         int seatchoice=obj.nextInt();
         r.reserveseat(seatchoice);
         }
      catch(InputMismatchException e){
         System.out.println("Error:Invalid input type enter a valid one");
         }
      catch(IllegalArgumentException e){
         System.out.println("Error:"+e.getMessage());
         }
      catch(SeatAlreadyBookedException e){
         System.out.println("Error:"+e.getMessage());
         }
      catch(Exception e){
         System.out.println("Error:"+e.getMessage());
         }
      finally{
         System.out.println("Transaction complete\n");
         }
      }
   }
}         
