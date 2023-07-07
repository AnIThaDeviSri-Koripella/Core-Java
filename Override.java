

class A1
{
    void show()
    {
        System.out.println("in A show");   
    }
    void config()
    {
        System.out.println("in A config");
    }
}
class B1 extends A1
{
    protected void show()
    {
        System.out.println("in B show");
    }
}
public class Override 
{
    public static void main(String args[])
    {
        B1 obj = new B1();
        obj.show();  //show method in b(child) overrides the show method in a(parent).
        obj.config();
    }   
}
