class Calculator2
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int add(int n1, int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}

public class overloading 
{
    public static void main(String args[])
    {
        Calculator2 calc = new Calculator2();
        int result = calc.add(2,7);
        System.out.println (result);
    }
    
}
