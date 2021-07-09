
interface Drawable {
    void draw();
}

class Rect implements Drawable {
    public void draw(){
        System.out.println("Hello");
    }
}

class cir implements Drawable {
    public void draw(){
        System.out.println("Hi");
    }
}

public class interface_example2 {

    public static void main(String[] args) {
        Drawable d = new cir();
        d.draw();
        Drawable r = new Rect();
        r.draw();
    }
    
}
