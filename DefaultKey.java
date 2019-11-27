interface A
{
     void show();

    default void hi()
    {
        System.out.println("hi");
    }
}

class B implements A
{
    public void show()
    {

        System.out.println("this");
    }
}

class DefaultKey
{
    public static void main(String args[])
    {
        B b = new B();

        b.show();
        b.hi();

        A a = new B();
        a.hi();
    }
}

