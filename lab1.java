import java.util.*;
class student
    {
        String name,usn;
        void accept()
        {
            Scanner obj=new Scanner(System.in);
            System.out.print("enter a name:");
            name=obj.next();
            System.out.print("enter a usn:");
            usn=obj.next();
        }
        void display()
        {
            System.out.println("name:"+name+"\n"+"USN:"+usn);
        }
        
    }
class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter number of students:");
        int n=obj.nextInt();
        student s[]=new student[3];
        for(int i=0;i<n;i++)
            s[i]=new student();
        for(int i=0;i<n;i++)
            {
                s[i].accept();
            }
        for(int i=0;i<n;i++)
            {
                s[i].display();
            }
    }
}
