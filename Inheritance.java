class Calcul
{                       //this class has 2 methods
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
class AdvCalcul extends Calcul   //single inheritance(AdvCalcul inherits the methods from Calcul).
{                        //this class has 4 methods
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class VeryAdvCalcul extends AdvCalcul  //multilevel inheritance, this class has VeryAdvCalcul and AdvCalcul and Calcul features(method and variables).
{                       //this class has 5 methods
    public double power(int n1,int n2)
    {
        return Math.pow(n1, n2);   //this method returns a double value.
    }
}

public class Inheritance 
{
    public static void main(String args[])
    {
        VeryAdvCalcul obj = new VeryAdvCalcul();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multi(2, 3);
        int r4 = obj.div(8, 03);
        double r5 = obj.power(r3, r4);
        System.out.println(r1+" "+r2+" "+ r3+" "+r4+" "+r5);
    }
    
}
//multiple inheritance is not possible due to ambiguity(confusion of choosing methods from which parent).
//In updated versions it gets implemented indirectly with the help of interfaces.