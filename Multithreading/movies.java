class bookmovieseat
{
    static int seats_available= 20;
    static int seats;
    static synchronized void bookseats(int seats)
    {
        if(seats <= seats_available)
        {
            System.out.println(seats + " Have been booked!");
            System.out.println("seats left are" + (seats_available-seats));
            seats_available-=seats;
        }
        else{
            System.out.println("Sorry! We are not able to book the requested seats, seats left are: " + seats_available);
        }
    }
}
     class user1 extends Thread
    {
        bookmovieseat b;
        int seats;
        user1(bookmovieseat b, int seats)
        {
            this.b = b;
            this.seats = seats;
        }
        public void run()
        {
            b.bookseats(seats);
        }

    }
     class user2 extends Thread
    {
        bookmovieseat b;
        int seats;
        user2(bookmovieseat b, int seats)
        {
            this.b = b;
            this.seats = seats;
        }
        public void run()
        {
            b.bookseats(seats);
        }

    }
     class user3  extends Thread
    {
        bookmovieseat b;
        int seats;
        user3(bookmovieseat b, int seats)
        {
            this.b = b;
            this.seats = seats;
        }
        public void run()
        {
            b.bookseats(seats);   //yess
        }

    }

    class movies
    {
        public static void main(String[] args) {
            bookmovieseat b= new bookmovieseat();
            user1 u1 = new user1(b, 4);
            user2 u2 = new user2(b, 17);
            user3 u3 = new user3(b, 5);
            u1.start();
            u2.start();
            u3.start();
        }
    }
