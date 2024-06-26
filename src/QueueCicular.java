// Program is for Circular queue


public class QueueCicular {

    static class Queue2{
        static int size,arr[],rear=-1,front=-1;
        Queue2(int size)
        {
            this.size=size;
            arr=new int[size];
        }

        // is empty condition
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }

        // is full condition
        public static boolean isFull()
        {
            return (rear+1) % size == front;
        }

        //add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Full Queue");
                return;
            }
            if(front== -1)
            {
                front = 0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        // remove
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }
            int result = arr[front];
            //single element condition
            if(rear== front)
            {
                rear=front=-1;
            }
            else
            {
                front =(front+1)%size;
            }
            return result;
        }
        // peek
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue2 q2=new Queue2(5);
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);
        System.out.println(q2.remove());
        q2.add(6);
        System.out.println(q2.remove());
        q2.add(7);



        while (!q2.isEmpty())
        {
            System.out.println(q2.peek());
            q2.remove();
        }
    }
}
