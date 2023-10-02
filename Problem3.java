/*
Sweet Seventeen Problem Statement
Given a maximum of four digit to the base 17 (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.

Test Cases
Case 1
Input – 1A
Expected Output – 27
Case 2
Input – 23GF
Expected Output – 10980
*/
import java.util.*;
class Problem3
{
	static long compute(String s,Map<Character,Integer>map)
	{
		long num=0;
		int k=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if((s.charAt(i) >='A' && s.charAt(i)<='Z') || (s.charAt(i) >='a' && s.charAt(i)<='z'))
			{
				num+=map.get(s.charAt(i))*(int)Math.pow(17,k++);
			}
			else
			{
				num+=((s.charAt(i)-'0') * (int)Math.pow(17,k++));
			}
		}
		return num;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer>map=new HashMap<>();
		map.put('A',10);
		map.put('B',11);
		map.put('C',12);
		map.put('D',13);
		map.put('E',14);
		map.put('F',15);
		map.put('G',16);
		map.put('a',10);
		map.put('b',11);
		map.put('c',12);
		map.put('d',13);
		map.put('e',14);
		map.put('f',15);
		map.put('g',16);
		String str=sc.nextLine();
		
		System.out.println("the answer is+"+compute(str,map));
	}
}