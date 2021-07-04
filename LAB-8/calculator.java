
import java.util.*;

class calculator{

    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Operations to perform :- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);

    while(true) {
        System.out.println("Enter the operation to execute :-");
        int c = sc.nextInt();

        if(c == 1){
            System.out.println("Enter the number a :- ");
            a = sc.nextInt();
            System.out.println("Enter the number b :- ");
            b = sc.nextInt();
            int result = a+b;

            System.out.println("Result = " + result);

        }
        else if(c == 2){
            System.out.println("Enter the number a :- ");
            a = sc.nextInt();
            System.out.println("Enter the number b :- ");
            b = sc.nextInt();
            int result = a-b;

            System.out.println("Result = " + result);

        }
        else if(c == 3){
            System.out.println("Enter the number a :- ");
            a = sc.nextInt();
            System.out.println("Enter the number b :- ");
            b = sc.nextInt();
            int result = a*b;

            System.out.println("Result = " + result);
        }
        else if(c == 4){
            System.out.println("Enter the number a :- ");
            a = sc.nextInt();
            System.out.println("Enter the number b :- ");
            b = sc.nextInt();
            float result = a/b;

            System.out.println("Result = " + result);

        }
        else if (c == 5){
            break;
        }
        else{
            System.out.println("Invalid Input");
        }

    }
    sc.close();
    }
}