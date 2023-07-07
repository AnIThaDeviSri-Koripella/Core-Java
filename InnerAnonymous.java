class AA
{
    public void show()
    {
        System.out.println("in show");
    }
}
// class BB extends AA
// {
//     public void show()
//     {
//         System.out.println("in B show");
//     }
// }
public class InnerAnonymous 
{
    public static void main(String args[])
    {
        AA obj = new AA()
        {                               //inner class without name (new implemetation of object).
            public void show()
            {
                System.out.println("in new show");  //this implementation overrides the method in class AA.
            } 
        };
        obj.show();
    }
    
}
