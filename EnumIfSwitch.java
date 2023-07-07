public class EnumIfSwitch 
{
    public static void main(String args[])
    {
        Status s = Status.Success;

        //if else with enum.
        if(s==Status.Running)
            System.out.println("All good");
        else if(s==Status.Failed)
            System.out.println("Try again");
        else if(s==Status.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");

        //switch with enum
        switch(s)
        {
            case Running:
                System.out.println("All good");
            case Failed:
                System.out.println("Try again");
            case Pending:
                System.out.println("Please wait");
            case Success:
                System.out.println("Done");

        }
        
    }
    
}
