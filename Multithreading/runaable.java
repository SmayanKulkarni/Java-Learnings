import java.util.*;

class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This thread is here");
    }

}

class runaable {
    public static void main(String args[]) {
        mythr t1 = new mythr("t1");
        mythr t2 = new mythr("t2");
        mythr t3 = new mythr("t3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The name of thread t1 is " + t1.getName());
        System.out.println("The name of thread t2 is " + t2.getName());
        System.out.println("The name of thread t3 is " + t3.getName());
        System.out.println("The id of thread t3 is " + t3.getId());
        System.out.println("The id of thread t1 is " + t1.getId());
        System.out.println("The id of thread t2 is " + t2.getId());

    }
}
