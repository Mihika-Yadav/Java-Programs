public class StackFromScratch {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next=null;
        }
    }

    static class StackMake
    {
        public static Node head;
        public static boolean isEmpty()
        {
           return head==null;
        }

        public static void push(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            // if head is not empty
            newNode.next=head;
            head=newNode;
        }

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args)
    {
        StackMake s=new StackMake();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }

}
