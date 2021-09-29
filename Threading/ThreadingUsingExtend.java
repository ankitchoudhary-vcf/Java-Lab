class Threading extends Thread {
     int delay;
     String msg;
     public Threading(int delay, String msg) {
        this.delay = delay;
        this.msg = msg;
        start();
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

public class ThreadingUsingExtend {
    public static void main(String[] args){
        Threading t = new Threading(1000, "Hello");
        Threading t1 = new Threading(500, "Hi");
    }

}
