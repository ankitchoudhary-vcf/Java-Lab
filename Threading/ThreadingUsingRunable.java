class Threadings implements Runnable {
    int delay;
    String msg;
    Thread t;
    public Threadings(int delay, String msg) {
       this.delay = delay;
       this.msg = msg;
       t = new Thread(this);
       t.start();
    }
    public void run() {
       for (int i = 0; i<=5; i++) {
           System.out.println(msg);
           try{
               Thread.sleep(delay);
           }
           catch(Exception e) {
               System.out.println(e);
           }
       }
    }
}

public class ThreadingUsingRunable {
   public static void main(String[] args){
       Threadings t = new Threadings(1000, "Hello");
       Threadings t1 = new Threadings(500, "Hi");
   }

}
