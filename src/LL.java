

class LL{
    class Node{
        String data;
            Node next;
           public Node(String data){
                this.data = data;
                this.next = null;
            }
    }
    public Node head = null;
    public void addFirst(String data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;



    }
    public void printList(){
        Node currNode = head;
        while(currNode!= null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("a");
        list.printList();

    }
}