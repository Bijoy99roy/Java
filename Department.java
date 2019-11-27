import java.util.Random;
import java.io.*;
import java.util.Scanner;
interface A
{
    int roll();
    public void name();
}

interface B
{
    void marks(int m1,int m2,int m3);
    void marks(int m1,int m2,int m3,int m4);
}
class C implements A,B 
{
    
    Scanner sc =new Scanner(System.in);
    public int roll()
    {
        Random pd = new Random();
        int rand = pd.nextInt(1000);
        return rand;
    }
    int mark1,mark2,mark3,marks4;
    public void marks(int m1,int m2,int m3)
    {
        System.out.println("Total marks: "+(m1+m2+m3));
    }

    public void marks(int m1,int m2,int m3,int m4)
    {
        System.out.println("Total marks: "+(m1+m2+m3+m4));
        
    }
    String namee;
    public void name()
    {
        namee = sc.nextLine();
        System.out.println("Name is: "+namee);
    }
}

class Cse extends C
{

}

class Ece extends C
{

}

class Department
{
    public static void main(String args[])
    {
        C obj = new Ece();
        C obj1 = new Cse();
        
        Scanner sc =new Scanner(System.in);
        int m1,m2,m3,m4;
        System.out.println("Enter name and marks for Ece student:");
        obj.name();
        System.out.println("roll no: "+obj.roll());
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        obj.marks(m1,m2,m3);
        
        System.out.println("Enter name and marks for Cse student:");
        obj1.name();
        System.out.println("roll no: "+obj1.roll());
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        obj1.marks(m1,m2,m3,m4);        
    }
}
/***
output:
    PS D:\java> javac Department.java
PS D:\java> java Department      
Enter name and marks for Ece student:
Zeeshan
Name is: Zeeshan
roll no: 572
40
50
60
Total marks: 150
Enter name and marks for Cse student:
Bijoy
Name is: Bijoy
roll no: 5
40
50
60
70
Total marks: 220
***/