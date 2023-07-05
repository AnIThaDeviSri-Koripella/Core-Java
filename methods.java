class Computer
{
    public void playmusic()
    {
        System.out.println("Music playing..");
    }
    public String getmeapen(int cost)
    {
        if(cost>=10)
        {
            System.out.println("thank u");
            return "pen";
        }
        else
        return "nothing";
    }
}

public class methods 
{
    public static void main(String args[])
    {
        Computer com = new Computer();
        com.playmusic();
        String str = com.getmeapen(12);
        System.out.println(str);

    }
    
}
