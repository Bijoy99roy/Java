abstract class A
{
    public abstract void callme();

    public void callme_2nd()
    {
        System.out.println("In callme_2nd");
    }
}
class B extends A
{
    public void callme()
    {
        System.out.println("In callme");
    }
}

class AbtractClass
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.callme();
        obj.callme_2nd();
    }
}