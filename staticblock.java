
class mobile
{
    String brand;
    int price;
    static String name;

    public mobile()  //constructor
    {
        brand = "a";
        price = 100;
        System.out.println("in constructor");  //we call constructor everytime we create the object.
    }
    static  //static block
    {
        name = "smartphone";  //static var should initialized in static block because static variable don't need to call everytime you call the constructor once is enough.
        System.out.println("static block");
    }
    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class staticblock 
{
    public static void main(String args[])
    {
        mobile obj = new mobile();
       
        
        mobile obj1 = new mobile();
        obj1.brand = "samsung";
        obj1.price = 500;
        obj.show();
        obj1.show();
    }

    
}
