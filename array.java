

public class array 
{
    public static void main(String args[])
    {
        int nums[] = {2,3,4,5};
        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        int nums2[] = new int[5];
        nums2[1]=23;
        nums2[3]=28;
        nums2[4]=41;
        nums2[0]=46;
        for(int j=0;j<5;j++)
        {
            System.out.println(nums2[j]);
        }
    }
    
}
