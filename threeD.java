
public class threeD
{
    public static void main(String args[])
    {
        int nums [][][] = new int[3][3][];
        nums[0][0]=new int[3];
        nums[0][1]=new int[2];
        nums[0][2]=new int[1];
        nums[1][0]=new int[1];
        nums[1][1]=new int[2];
        nums[1][2]=new int[3];
        nums[2][0]=new int[1];
        nums[2][1]=new int[2];
        nums[2][2]=new int[3];
       
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                for(int k=0;k<nums[i][j].length;k++)
                {
                    System.out.print(nums[i][j][k]+"  ");
                }
                System.out.println();
            }
        }
        for(int n[][]:nums)
        {
            for(int m[]:n)
            {
                for(int o:m)
                {
                    System.out.print(o + "  ");
                }
                System.out.println();
            }
        }
    }
    
}
