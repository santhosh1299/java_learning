public class Exception {
    
public int div(int a)
{
    return a/0;
}

    public static void main(String[] args) {
        
        Exception f =new Exception();
        try 
        {
            int a = f.div(5);
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        finally
        {
            System.out.println("Finally executing....  ");
        }

    }
}