/*Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
*/
import java.util.*;
import java.io.*;
class Problem1
{
	static int[] rotate(int nums[],int k,int n)
	{
		k=k%n;
		int ans[]=new int[n];
		for(int i=0;i<k;i++)
		{
			ans[i]=nums[n-k+i];
		}
		int index=0;
		for(int i=k;i<n;i++)
		{
			ans[i]=nums[index++];
		}
		return ans;
	}
	public static void main(String args[])
	{
		int Array[] = { 1, 2, 3, 4, 5 };
        int N = 5;
        int K = 2;

        int[] ans = rotate(Array, K, N);
        for (int i = 0; i < N; ++i) {
        System.out.println(ans[i]);
		}
	}
}
		