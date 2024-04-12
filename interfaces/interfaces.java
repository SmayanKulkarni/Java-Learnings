
interface bicycle
{
    int a=45;
    void applybrake(int decrease);
    void speedup(int increase);
    
}

class hero implements bicycle
{
    void blowhorn()
    {
        System.out.println("pee pee");
    }
    public void applybrake(int decrease)
    {
        System.out.println("Applying breaks");
    }
    public void speedup(int increase)
    {
        System.out.println("Applying accelerator");
    }
}

public class interfaces {
    
}
