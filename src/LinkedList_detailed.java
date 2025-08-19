
public class LinkedList_detailed {      //without recursive function
   public static class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
       }
   }
   public static void display(Node head){
       while(head !=null){
           System.out.print(head.data + " ");
           head = head.next;
       }

   }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(7);
        Node d = new Node(8);
        a.next = b;  //the address of b is now stored in a.next.
        b.next = c;
        c.next = d;
        d.next = null;
        System.out.println(a.next.data);
        //loop method
        Node temp = a;
        while(temp.next!=null){
            for(int i =1;i<=4;i++){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        display(a);


    }
}


