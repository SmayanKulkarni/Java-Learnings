abstract class parent
{
    public parent()
    {
        System.out.println("Inside base2");
    }
    public void sayhello()
    {
        System.out.println("Hello");
    }

    abstract public void greet(); 
}

class child extends parent
{
    
    public void greet()
    {
        System.out.println("Good Morning");
    }
}

abstract class child3 extends parent
{
    public void th()
    {
        System.out.println("Good");
    }
}

class abs{

    public static void main(String args[])
    {
        // parent p = new parent(); throws error as u cannot make obj for abstract class
        child c = new child(); 
    }
}