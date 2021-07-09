
abstract class HBike {
    abstract void run();
}

class Test extends HBike {
    void run() {
        System.out.println("Running Safely");
    }
    public static void main(String[] args) {
        HBike obj = new Test();
        obj.run();
    }
}