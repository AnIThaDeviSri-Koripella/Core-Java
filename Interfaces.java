interface InterA
{
    int age = 44;    //By default variables are final and static

    void show();     //By default methods are public abstract
    void config();
}
interface InterB
{
    void run();
}

interface InterC extends InterB
{
    int count();
}

class Interfacee implements InterA,InterC
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running..");
    }
    public int count()
    {
        System.out.println("99");
        return 0;
    }
}

public class Interfaces 
{
    public static void main(String args[])
    {
        InterA obj = new Interfacee();
        obj.show();
        obj.config();

        InterC obj1 = new Interfacee();
        obj1.run(); 
        obj1.count();     
        System.out.println(InterA.age); 
    }
    
}
