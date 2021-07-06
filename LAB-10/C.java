

abstract class P {
   abstract void message();
}

class A extends P {
    void message(){
        System.out.println("This is first subclass");
    }
}

class B extends P {
    void message() {
        System.out.println("This is second subclass");
    }
}

class C {
    public static void main(String[] args){
        
        P a = new A();
        P b = new B();
        a.message();
        b.message();
    }
}