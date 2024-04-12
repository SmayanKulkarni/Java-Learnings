class c1
{
    int a;
    
    c1(int a)
    {
        this.a=a;
    }
    public int getA()
    {
        return a;
    }

   
    public int return1()
    {
        return 1;
    }
}

class c2 extends c1
{
    c2(int c)
    {
        super(c);
        System.out.println("I am a constructor in c2");
    }
}
class super1{
    
public static void main(String args[])
{
        c1 e =new c1(65);
        c2 d = new c2(5);
        System.out.println(e.getA());
}
}