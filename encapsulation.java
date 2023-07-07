class Human
{
    private int age;       //not accesible by other classes because private
    private String name;   //not accesible by other classes because private
   
    public void setAge(int a)      //private variables are getting accesed through methods here
    {
        age = a;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

}

public class encapsulation 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(20);
        obj.setName("Ani");
        System.out.println(obj.getAge()+" : "+obj.getName());

    }
    
}
