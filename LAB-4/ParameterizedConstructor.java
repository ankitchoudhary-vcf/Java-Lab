
class ParameterizedConstructor
{
    int id;
    String name;

    ParameterizedConstructor(int i, String n)
    {
        id = i;
        name = n;
    }

    void display(){
                System.out.println("Id: " + id + "\nName: " + name + "\n************************************" );
    }

    public static void main(String[] args)
    {
        ParameterizedConstructor S1 = new ParameterizedConstructor(111, "Raj");
        ParameterizedConstructor S2 = new ParameterizedConstructor(123, "Harry");

        S1.display();
        S2.display();
    }
}