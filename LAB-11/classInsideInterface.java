
interface J {
    class K {
        int x = 0;
        void Print() {
            System.out.println("The value is " + x);
        }
    }
}

public class classInsideInterface extends J.K {

    public static void main(String[] args) {
        classInsideInterface d = new classInsideInterface();
        d.Print();
        d.x = 20;
        d.Print();
    }
}
