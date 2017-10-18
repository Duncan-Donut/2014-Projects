import java.util.Scanner;
import java.util.Arrays;
public class Towers
{
    public static void main(String[] args)
    {
        Scanner sf = new Scanner(System.in);
        
        int[] nums = new int[6];
        
        for(int x = 0; x<6; x++)
        {
            nums[x] = sf.nextInt();
        }
        int height1 = sf.nextInt();
        int height2 = sf.nextInt();
        
        int[] stack1 = new int[3];
        Arrays.sort(nums);
        
        for(int x = 0; x<4; x++)
        {
        	for(int y = x+1; y<5; y++)
        	{
        		for(int z = y+1; z<6; z++)
        		{
        			if(nums[x]+nums[y]+nums[z] == height1)
        			{
        				stack1[0] = nums[x];
        				stack1[1] = nums[y];
        				stack1[2] = nums[z];
        				nums[x] = -1;
        				nums[y] = -1;
        				nums[z] = -1; 
        				break;
        			}
        		}
        	}
        }
        Arrays.sort(stack1);
        
        for(int x=2; x>=0; x--)
        {
        	System.out.print(stack1[x] + " ");
        }
        for(int x=5; x>=0; x--)
        {
        	if(nums[x] != -1)
        	{
        		System.out.print(nums[x] + " ");
        	}
        }
        System.out.println();
   
    }
}