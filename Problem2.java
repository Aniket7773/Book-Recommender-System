import java.util.*;
class Problem2
{
	static boolean palin(String s)
	{
		if(s.length()==1)return true;
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		
		return (s.equals(str.toString()));
	}
	public static void main(String args[])
	{
		String s="aaaaa";
		String s1,s2,s3;
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			s1=s.substring(0,i);
			if(palin(s1))
			{
				for(int j=0;j<l-i;j++)
				{
					s2=s.substring(i,j);
					s3=s.substring(i+j,l-i-j);
					if(palin(s2) && palin(s3))
					{
						System.out.println("The strings arre:"+s+" "+s1+" "+s2+" "+s3);
					}
				}
			}
			else
			{
				System.out.println("Impossible");
			}
		}
	}
}