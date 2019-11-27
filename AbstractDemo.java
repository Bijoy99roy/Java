abstract class Human
{
    public abstract void show();

    void disp()
    {
        System.out.println("In Abstract class");
    }
}

class Man extends Human
{
    public void show()
    {
        System.out.println("Declared in Abstract class defined in eextended class");
    }

    void show(Number i) // Number, an abstract class been extended by all the Wrapper classes like Integer,Float,Double so to save time we can use Number Instead any wrapper class
    {
        System.out.println(i);
    }
}

class AbstractDemo
{
    public static void main(String args[])
    {
        Man obj = new Man();

        obj.disp();
        obj.show(2.3f);
    }
}
/**
1.object of Abstract class can't be created
2.To access the attributes of Abstract class we hve to extend the Abstract class using another class.
3.we can declare a method only using abstract keyword.
4.To use abstract keyword the class has to be abstract.
5.declared method should be defined i the child class. */