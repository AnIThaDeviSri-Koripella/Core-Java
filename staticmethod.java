
class Mobile1
{
    String brand;
    int price;
    static String name = "phone";

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }

    public static void show1(Mobile1 obj)  //passing object reference to static method for knowing which obj should details should be printed.
    {
        System.out.println(obj.brand+" : "+obj.price+" : "+name); //specific object brand
        System.out.println("static method");
    }

}

public class staticmethod 
{
    public static void main(String args[])
    {
        Mobile1 obj = new Mobile1();
        obj.brand = "Apple";
        obj.price = 200;
        

        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Samsung";
        obj1.price = 300;

        Mobile1.show1(obj);  //static method should call with class name

        obj.show();  //non static method should call with object reference
        obj1.show();
       
    }
    
}
