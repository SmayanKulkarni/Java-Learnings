import java.util.*;

class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        while(true) 
        {
        System.out.println("This thread is here: " + this.getName());
        try {
            Thread.sleep(455);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }

}

class priority {
    public static void main(String args[]) {
        mythr t1 = new mythr("t1");
        mythr t2 = new mythr("t2");
        mythr t3 = new mythr("t3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        try
        {
            t1.join(); //t2 wont start before t1 ends
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t1.start();
        t2.start();
        t3.start();
    }
}
