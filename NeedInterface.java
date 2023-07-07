interface Computer1
{
    void code();
}

class Laptop implements Computer1
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}
class Desktop implements Computer1
{
    public void code()
    {
        System.out.println("code,compile,run:faster");
    }
}
class Developer
{
    public void devApp(Computer1 obj)
    {
        obj.code();
    }
}

class NeedInterface
{
    public static void main(String args[])
    {
        Computer1 lap = new Laptop();
        Computer1 desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(lap);
        dev.devApp(desk);
    }
    
}
