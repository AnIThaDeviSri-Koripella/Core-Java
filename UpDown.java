class Up
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class Down extends Up
{
    public void show2()
    {
        System.out.println("in B show");
    }
}

public class UpDown 
{
    public static void main(String args[])
    {
        // Up obj = (Up)new Down(); //(implicit) Up casting___here subclass object converts into superclass object.
        // obj.show1();
    

        // Down obj1 =  (Down)obj;  //(explicit)Down casting___here super class reference converted into sub class reference.
        // obj1.show2();  
        // obj1.show1();  //here superclass method is called by sub class reference
        Up obj1 = new Down();
        Down obj;
        obj = (Down)obj1;
        obj1 = (Up)obj;
        obj.show1();
        obj.show2();
        obj1.show1();
        
    }
    
}
