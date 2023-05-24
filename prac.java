import java.util.Scanner;

class AvailableTickets extends Thread{

    int availableTickets;
    int johnReq;
    int MikeReq;

    public AvailableTickets(int availableTickets, int johnReq, int MikeReq) {

        this.availableTickets = availableTickets;
        this.johnReq = johnReq;
        this.MikeReq = MikeReq;
    }

    synchronized public void run(){

            String currentThreadName = Thread.currentThread().getName();

            if(currentThreadName.equals("John")){

                if(johnReq>availableTickets){
                    System.out.println("John not booked");
                    return;
                }

                System.out.println("John booked"+ johnReq);
                availableTickets-=johnReq;
            }

            else{

                if(currentThreadName.equals("Mike")){

                    if(MikeReq>availableTickets){
                        System.out.println("Mike not booked");
                        return;
                    }
        
                    System.out.println("Mike booked "+ MikeReq);
                    availableTickets-=MikeReq;
                }
            }

    }
}



public class prac {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int availableTickets=sc.nextInt();
        int johnReq=sc.nextInt();
        int mikeReq = sc.nextInt();
        
        AvailableTickets a = new AvailableTickets(availableTickets, johnReq, mikeReq); 

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.setName("John");
        t2.setName("Mike");

        t1.setPriority(10);

        t1.start();
        t2.start();
    }



}