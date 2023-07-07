class Ani
{
    Ani()
    {
        System.out.println("object created");
    }
    void show()
    {
        System.out.println("in A show");
    }
}

public class Anonymous 
{
    public static void main(String args[])
    {
        new Ani(); //anonymous object created in the heap, no name for the object(no reference variable here)
        new Ani().show();  //whenever we use new keyword with constructor it creates another object of that class.
        new Ani().show();
        //anonymous object can't be reusable because when we try to reuse it creates another object.
        // in this code there is empty stack
    }

}
