public class Encapsulate {
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void SetName(String name)
    {
       this.name=name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age > 0)
        {
            this.age=age;
        }
        else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        Encapsulate ob=new Encapsulate();
        ob.SetName("Mihika");
        ob.setAge(14);

        System.out.println("Name is : " +ob.getName());
        System.out.println(" Age is : " +ob.getAge());

        ob.setAge(-5);
        System.out.println("Age is : "+ob.getAge());

    }
}
