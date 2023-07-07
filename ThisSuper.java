class A
{
    A()
    {
        super();
        System.out.println("In A");
    }
    A(int n)
    {
        super();
        System.out.println("In int A");
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("In B");
    }
    B(int n)
    {
        super();
        System.out.println("In int B");
    }
}

public class ThisSuper 
{
    public static void main(String args[])
    {
        B obj = new B(4);
        System.out.println(obj);   
    }  
}
