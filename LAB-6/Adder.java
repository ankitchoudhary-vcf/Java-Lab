

class Test1 {
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b, double c) {
        return a + b + c;
    }
}

class Adder {
    public static void main(String[] args)
    {
        System.out.println("Addition of 20 + 30 is:- " + Test1.add(20, 30));
        System.out.println("Addition of 20 + 30 + 10 is:- " + Test1.add(20, 30,10));
        System.out.println("Addition of 20 + 30 + 10 is:- " + Test1.add(20.0, 30.0,10.0));
    }
}