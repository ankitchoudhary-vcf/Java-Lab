
interface Printing {
    void Print();
}
interface Showable {
    void Show();
}


public class Multiple_inheritance implements Printing, Showable {
    public void Print() {
        System.out.println("Hello");
    }
    public void Show() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        Multiple_inheritance d = new Multiple_inheritance();
        d.Print();
        d.Show();
    }
}
