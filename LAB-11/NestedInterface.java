
interface Showing {
    void show();

    interface Message {
        void msg();
    }
}

public class NestedInterface implements Showing.Message {

    public void msg() {
        System.out.println("NestedInterface");
    }

    public static void main(String[] args) {
        Showing.Message d = new NestedInterface();
        d.msg();
    }
}
