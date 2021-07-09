interface Printable {
    void Print();
}
class interface_example implements Printable{
    
    public void Print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        interface_example example = new interface_example();
        example.Print();
    }
    
}
