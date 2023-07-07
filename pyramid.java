
public class pyramid 
{
    public static void main(String args[])
    {
        int nums[][] = new int[5][];
        nums[0]=new int[1];
        nums[1]=new int[2];
        nums[2]=new int[3];
        nums[3]=new int[4];
        nums[4]=new int[5];
        nums[0][0]=1;
        nums[1][0]=2;
        nums[1][1]=3;
        nums[2][0]=4;
        nums[2][1]=5;
        nums[2][2]=6;
        nums[3][0]=7;
        nums[3][1]=8;
        nums[3][2]=9;
        nums[3][3]=10;
        nums[4][0]=11;
        nums[4][1]=12;
        nums[4][2]=13;
        nums[4][3]=14;
        nums[4][4]=15;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]+"   ");
            }
            System.out.println();
        }
    }
    
}
