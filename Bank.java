class MBank
{
    double rate;
    public double interest()
    {
        return rate = 5;
    }
}
class Icici extends MBank
{
    public double interest()
    {
        return rate = 6;
    }
}
class Sbi extends MBank
{
    public double interest()
    {
        return rate = 4.3;
    }
}

class Ubi extends MBank
{
    public double interest()
    {
        return rate = 4;
    }
}

class Pnb extends MBank
{
    public double interest()
    {
        return rate = 3;
    }
}


class Bank
{
    public static void main(String args[])
    {
        Sbi obj = new Sbi();
        Icici obj1 = new Icici();
        Pnb obj2 = new Pnb();
        Ubi obj3 = new Ubi();

        System.out.println(obj.interest());
        System.out.println(obj1.interest());
        System.out.println(obj2.interest());
        System.out.println(obj3.interest());
    }
}

/***
o/p:
PS D:\Learnjava> javac Bank.java
PS D:\Learnjava> java Bank
4.3
6.0
3.0
4.0
***/