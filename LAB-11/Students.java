
public class Students {
    String name;
    Students() {
        this.name = "unknown";
        PrintName();
    }
    Students(String name) {
        this.name = name;
        PrintName();
    }
    void PrintName() {
        System.out.println("The Student Name is " + this.name);
    }

    public static void main(String[] args) {
       new Students();
       new Students("Harry");
    }
}
