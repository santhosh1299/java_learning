class Dog
{

    String name;
    int age;
    String breed;
    
    public String bark()
    {
       return ("Bow Bow");
    }
    public int getAge()
    {
        return this.age;
    }
    public void display(String name,int age,String breed,String use)
    {
        System.out.println("Name "+name+"\n"+"Age "+age+"\n"+"Breed "+breed+"\n"+"Use "+use);
        
    }

    public static void main(String[]args)
    {
      CompanionDog a=new CompanionDog();
       a.name = "Mike";
       a.age = 4;
       a.breed = "Golden Retriever";
        a.use ="Companion";
       a.display(a.name,a.age,a.breed,a.use);
      

    }
}
class CompanionDog extends Dog
{
 String use;
 public String getUse()
    {
        return this.use;
    }
    public static void main(String[] args)
    {
        Dog b = new Dog();
       
    }
}