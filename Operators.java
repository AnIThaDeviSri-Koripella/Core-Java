public class Operators 
{
    public static void main(String args[])
    {
        //arithmetic operators
        int a = 40;
        int b = 30;
        int sum = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        int modulo = a%b;
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        //relational operators
        int x = 50;
        int y = 40;
        boolean less = x<y;
        boolean greater = x>y;
        boolean equals = x==y;
        boolean notequals = x!=y;
        boolean lessequals = x>=y;
        boolean greaterequals = x<=y;
        System.out.println(less);
        System.out.println(greater);
        System.out.println(equals);
        System.out.println(notequals);
        System.out.println(lessequals);
        System.out.println(greaterequals);

        //assignment operators
        x += 2;
        y -= 18;
        System.out.println(x);
        System.out.println(y);
        x /= 2;
        y *= 3;
        System.out.println(x);
        System.out.println(y);
        y %= 7;
        System.out.println(y);

        //logical operators
        boolean and = (a>b)&&(x>y);
        boolean or = (a>b)||(x<y);
        boolean not = !(or);
        System.out.println(and);
        System.out.println(or);
        System.out.println(not);

        //increment /decrement operators
        int preincre = ++a;
        a=40;
        int postincre = a++;
        a=40;
        int predecre = --a;
        a=40;
        int postdecre = a--;
        System.out.println(preincre);
        System.out.println(postincre);
        System.out.println(predecre);
        System.out.println(postdecre);



    }
    
}
