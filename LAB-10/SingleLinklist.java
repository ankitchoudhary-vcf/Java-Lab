
public class SingleLinklist {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " \n");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        SingleLinklist list = new SingleLinklist();

        list.head = new Node(100); 
        list.head.next = new Node(200);
        list.head.next.next = new Node(300);

        list.display();
    }
   
}
