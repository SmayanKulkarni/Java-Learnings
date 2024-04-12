
class base
{
    int x;
    public void setx(int x)
    {
        this.x=x;
    }
    public int getx(int x) 
    {
        return x;
    }
    public void display()
    {
        System.out.println("Printing");
    }
}   

class derived extends base{
    int y;
    public void sety(int y)
    {
        this.y=y;
    }
    public int gety(int y)
    {
        return y;   
    }
}

public class inheritance2
{
    public static void main(String[] args)
    {
        derived obj=new derived();
        obj.setx(10);
        obj.sety(20);
        obj.display();
        System.out.println(obj.getx(obj.x));
        System.out.println(obj.gety(obj.y));
    }
}