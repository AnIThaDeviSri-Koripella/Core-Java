class Calc
{
    final int a = 7;
    final public void show()     //cannot override a final method.
    {
        System.out.println("in Calc show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
final class AdvCalc extends Calc   //cannot inherit the properties of final class.
{
    public void show1()
    {
        System.out.println("in AdvCalc show");
    }
}

public class FinalKw 
{
    public static void main(String args[])
    {
        AdvCalc obj = new AdvCalc();
        obj.add(3,7 );
        obj.show();
        //obj.a = 4;   cannot change a value of final variable.
        System.out.println(obj.a);

    }
    
}
