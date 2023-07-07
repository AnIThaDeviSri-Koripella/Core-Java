enum Status
{
    Running,Failed,Pending,Success;  //these are all objects of Status class.
}

public class Enums 
{
    public static void main(String args[])
    {
        Status s = Status.Success;
        System.out.println(s.ordinal());

        Status ss[] = Status.values();

        for(int i=0;i<ss.length;i++)  //normal for loop
        {
            System.out.println(ss[i]+" : "+i);
        }

        for(Status sss : ss)   //for each loop
        {
            System.out.println(sss +" : "+sss.ordinal());
        }
    }
    
}
