class A11 
{
    int age;
    
    public void show()
    {
        System.out.println("In show");
    }
    class B1
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class Inner 
{
    public static void main(String args[])
    {
        
        
        A11 obj = new A11();
        obj.show();

        A11.B1 obj1 = obj.new B1();  //if B1 is static we should use new A1.B1() instead of obj.new B1().
        obj1.config();
    }
    
}
