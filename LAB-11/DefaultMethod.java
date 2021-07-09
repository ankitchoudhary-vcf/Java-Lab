
interface Drawing {
    void draw();
    default void msg() {
        System.out.println("Default Method");
    }
}

public class DefaultMethod implements Drawing {
    public void draw() {
        System.out.println("Rectangle");
    }

    public static void main(String[] args) {
        Drawing d = new DefaultMethod();
        d.draw();
        d.msg();
    }
    
}
