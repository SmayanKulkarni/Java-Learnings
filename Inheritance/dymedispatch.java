class phone 
{
    public void name()
    {
        System.out.println("My name is java in class 1");
    }
    public void greet()
    {
        System.out.println("Good Morning");
    }


}

class Smartphone extends phone
{
    public void name()
    {
        System.out.println("My name is java in class 2");
    }
    public void swaagat()
    {
        System.out.println("Aapka swagat hai");
    }
}




class dymedispatch
{
    public static void main(String args[])
    {
        phone obj = new Smartphone();
        obj.name();

    }
}
