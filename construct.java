class Human2
{
    private int age = 30;  //we can also mention default values here instead of constructor.
    private String name;
    public Human2()  //default constructor
    {
       
        name = "lucky";
    }
    public Human2(int a, String name)  //parameterised constructor
    {
        age = a;
        this.name = name;  //this keyword represents instance variable here
    }
    public int getAge()   //get method to get the instance variable inside the same class
    {
        return age;   //returns the value of age variable when calling this get method.
    }
    
    public String getName() 
    {
        return name;  ////returns the value of name variable when calling this get method.
    }
    

}

public class construct
{
    public static void main(String args[])
    {
        Human2 obj = new Human2();
        Human2 obj1 = new Human2(21,"ani");  //passing values to the constructor
        System.out.println(obj.getName()+" : "+obj.getAge());  //printing default values mentioned in the default constructor
        System.out.println(obj1.getName()+" : "+obj1.getAge()); //printing passed values mentioned in the parameterised constructor
    }
}
