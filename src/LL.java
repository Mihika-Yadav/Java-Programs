// Program to implement a basic Linked List

public class LL {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

     Node head;
   public static void add(int data)
    {
        Node newNode = new Node(Data);
        if(head ==null)
        {
            head=newNode;
        }
        else
        {
           Node temp=head;
            while (temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    public static void printList()
    {
        Node temp =head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LL list =new LL();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(78);
        list.printList();

    }

}
