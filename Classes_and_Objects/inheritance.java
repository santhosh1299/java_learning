public class inheritance {
    
    int name=10;
 
    public int get()
    {
        return name;
    }

}
 
class two extends inheritance
{
  public  int bank=199;

}

class three extends two
{
    public static void main(String[] args) {
        three obj = new three();
        System.out.println(obj.get());
        System.out.println();
    }
 

}
