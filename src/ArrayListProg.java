import java.util.ArrayList;

public class ArrayListProg {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(14);
        list.add(34);
        list.add(45);

        System.out.println(list);
        int element=list.get(0);
        System.out.println(element);

        list.add(1,4);
        System.out.println(list);


        list.set(3,7);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        System.out.println(list.size());

        //loops

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}
