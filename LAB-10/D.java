

class X {
    String s = "Class X";
}

class Y extends X {
    String s = "Class Y";
    {
        System.out.println(super.s);
    }
}

class Z extends Y {
    String s = "Class Z";
    {
        System.out.println(super.s);
    }

}


public class D {
    public static void main(String[] args) {
        Z z = new Z();
        System.out.println(z.s);
    }
}
