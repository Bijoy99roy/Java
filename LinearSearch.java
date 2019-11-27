import java.util.Scanner;
class SearchException extends Exception{
SearchException()
{
super();
}
public void printStackTrace(){
super.printStackTrace();
}
public String GetMessage(){
return("There is an exception data not found");
}
}

class LinearSearch{
public static void main(String args[]) throws SearchException
{
Scanner s=new Scanner(System.in);
int a[]={1,2,3,4,5,6,7,8,9};
int j = 0;
System.out.print("Enter the number to find:");
int b=s.nextInt();
try{
for(int i=0;i<9;i++)
{
if(a[i]==b)
{
System.out.println("The number is in the array");
j=1;
}
}
if(j==0)
throw new SearchException();
}
catch(SearchException e)
{
e.printStackTrace();
System.out.println(e.GetMessage());
}
}
}

/***
o/p:
PS C:\> d:
PS D:\> cd java
PS D:\java> javac LinearSearch.java
PS D:\java> java LinearSearch      
Enter the number to find:122
SearchException
        at LinearSearch.main(LinearSearch.java:33)
There is an exception data not found

***/