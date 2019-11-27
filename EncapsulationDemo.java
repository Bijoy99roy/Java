//Encapsulation is binding data to the methods
// It is mainly used for security purpose, so that noone other than getter and setter method can access it.

class Student
{
    private int rollno;
    private String name;

    public void setRollno(int rollno)
    {
        this.rollno = rollno;
        System.out.println("RollNo is changed"); // This is used to get the log file and to keep track of the data.
    }
    public int getRollno()
    {
        System.out.println("RollNo is fetched");
        return rollno;
    }

    public void setName(String name)
    {
        this.name = name;
        System.out.println("Name is changed");
    }
    public String getName()
    {
        System.out.println("Name is fetched");
        return name;
    }
}

class EncapsulationDemo
{
    public static void main(String args[])
    {
        Student obj = new Student();
        obj.setRollno(2);
        obj.setName("Bijoy");

        System.out.println(obj.getName());
        System.out.println(obj.getRollno());
    }
}