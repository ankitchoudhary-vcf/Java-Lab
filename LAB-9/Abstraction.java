
abstract class Bike {
    Bike(){
        System.out.println("Constructor Created");
    }
    abstract void run();
    void gear(){
        System.out.println("Gear Changed");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("Running Safely");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.gear();
    }
}