abstract class ABCD
{
    public abstract void show();
    public abstract void config();
}

public class AAInner 
{
    public static void main(String args[])
    {
        ABCD obj = new ABCD()   //here we are not creating object of abstract class,we are creating the object of anonymous inner class.
        {
            public void show()
            {
                System.out.println("in new show");
            } 
            public void config()
            {
                System.out.println("in config");
            } 
        };
        obj.show();
        obj.config();
    }
    
}
