class Aaa
{
    void show()
    {
        System.out.println("In A show");
    }
}
class Bbb extends Aaa
{
    void show()
    {
        System.out.println("In B show");
    }
}
class Ccc extends Aaa
{
    void show()
    {
        System.out.println("In C show");
    }
}

public class RtPoly 
{
    public static void main(String args[])
    {
        Aaa obj = new Aaa();
        obj.show();

        obj = new Bbb();
        obj.show();

        obj = new Ccc();
        obj.show();
    }
    
}
