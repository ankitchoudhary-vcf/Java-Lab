
class U {
    interface Messaging {
        void msg();
    }
}

public class interfaceInsideClass implements U.Messaging {
    public void msg() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        U.Messaging d = new interfaceInsideClass();
        d.msg();
    }
}
