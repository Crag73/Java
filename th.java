public class th extends Thread {
    public static void main(String[] args) {
      th thread = new th();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }  