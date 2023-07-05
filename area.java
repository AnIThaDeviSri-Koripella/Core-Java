class Calculator1
{
    int num = 5;     //stored in heap memory(instance variable)
    public int add(int n1,int n2)      //method initiation
    {
        System.out.println(num);
        return n1+n2;
    }
}

public class area
{
    public static void main(String args[])
    {
        int data = 10;          //variable stored in stack
        Calculator1 calc = new Calculator1();       //objects created in heap,reference variable stored in stack.
        Calculator1 calc1 = new Calculator1();
        int r1 = calc.add(2,7);            //variable stored in stack
        System.out.println(r1);
        calc1.num = 6;
        System.out.println(calc1.num);
        System.out.println(calc.num);
        System.out.println(data);


    }
    
}
