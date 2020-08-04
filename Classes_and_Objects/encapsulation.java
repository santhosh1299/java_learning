public class encapsulation {
    
    String name = "default";
    int age;
    int roll;

    public void setname(String s)
    {
        name= s;
        
    }
    public void setAge(int  a)
    {
        age= a;
        
    }
    public void setRoll(int roll_no)
    {
        roll= roll_no;
        
    }
    public String getName()
    {
        return (name);
    }
    public int getAge()
    {
        return age;

    }
    public int getRoll()
    {
        return roll;
    }
       public static void main(String [] args)
       {
           encapsulation obj = new encapsulation();
           obj.setname("Mike"); 
           obj.setAge(11);
           obj.setRoll(1231);

           System.out.println(obj.getAge());
           System.out.println(obj.getName());
           System.out.println(obj.getRoll());

       }
}

class test
{
    public static void main(String[] args) {
        encapsulation obj2 = new encapsulation();
        obj2.setname("from other class");
        System.out.println(obj2.getName());
    }
}