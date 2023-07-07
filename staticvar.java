class Mobile3
{
    String brand;
    int price;
    static String name = "Smartphone";
    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }
}
public class staticvar 
{
    public static void main(String args[])
    {
        Mobile3 obj1 = new Mobile3();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile3.name="phone";
        Mobile3 obj2 = new Mobile3();
        obj2.brand="Samsung";
        obj2.price=1700;
        obj1.show();
        obj2.show();
        System.out.println(Mobile3.name);

    }
    
}
