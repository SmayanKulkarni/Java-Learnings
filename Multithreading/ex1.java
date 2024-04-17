import java.util.*;
class thread1 extends Thread{
    public void run()
    {
        for(int i=0; i<5000;i++)
        {
            System.out.println("Cooking right now");        
        }
        
    }
}
class thread2 extends Thread{
    public void run()
    {
        for(int i=0; i<5000;i++)
        {
            System.out.println("Chatting right now");
        }
    }
}

class ex1
{
    public static void main(String args[])
    {
        thread1 t1= new thread1();
        thread2 t2= new thread2();
        t1.start();
        t2.start();
    }
}
