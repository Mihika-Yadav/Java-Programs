import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueCollection {
    static class Queue1{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }

        public static void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String[] args) {
        //Queue<Integer> q=new LinkedList<>();

        // implement through dequeue
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
