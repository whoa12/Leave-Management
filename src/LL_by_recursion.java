

public class LL_by_recursion {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
        public static void displayr(Node head){
            if(head == null) return;
            System.out.println(head.data + " ");
            displayr(head.next);
            }




    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(7);
        Node d = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        displayr(a);

    }
}
