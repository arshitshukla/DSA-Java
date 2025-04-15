// Java solution for Two Sum 
// leetcode link : https://leetcode.com/problems/two-sum/description/
import java.util.*;

public class TwoSum{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        int []ans=solve(arr,target);
        
        System.out.println(ans[0]+"  "+ans[1]);

        sc.close();
    }

    private static int[] solve(int[] arr,int target)
    {
        int [] ans=new int[2];
        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int diff=target-arr[i];
            
            if(mp.containsKey(diff))
            {
                ans[0]=mp.get(diff);
                ans[1]=i;

                return ans;
            }
            else{
                mp.put(arr[i],i);
            }
        }

        return ans;
    }
}