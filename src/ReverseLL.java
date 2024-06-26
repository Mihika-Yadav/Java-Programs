

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class ReverseLL {
    Node head;
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr != null)
        {
            // store the next node
            next=curr.next;

            //reverse the current node's pointer
            curr.next=prev;

            // Move pointers one position ahead
            prev=curr;
            curr=next;

        }
        head=prev;
    }

    // utility function to print the linked list

    public void printList(){
        Node temp =head;

        while(temp != null)
        {
            System.out.println(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLL list=new ReverseLL();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        list.head.next.next.next.next=new Node(5);

        System.out.println("Original list: ");
        list.printList();

        list.reverse();

        System.out.println("Reversed List");
        list.printList();


    }
}
