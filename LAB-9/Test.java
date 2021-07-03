
abstract class Bike {
    abstract void run();
}

class Test extends Bike {
    void run() {
        System.out.println("Running Safely");
    }
    public static void main(String[] args) {
        Bike obj = new Test();
        obj.run();
    }
}