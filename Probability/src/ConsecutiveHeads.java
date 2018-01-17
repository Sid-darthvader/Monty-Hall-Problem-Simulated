import java.util.Random;
import java.util.Scanner;

public class ConsecutiveHeads 
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of times you want the experiment to be repeated");
		int t=sc.nextInt();
		System.out.println("Enter the number of times the coin must be tossed in each experiment");
		int toss=sc.nextInt();
		String heads="HHHHHHHHHHHHHHHHHHHH";
		int sum[]=new int[toss+1];
		int sum1=0;
		int sum2=0;
		String s[]=new String[t+1];
		String sh;
		for(int i=1;i<=t;i++)
		{	s[i]="";
		for(int j=1;j<=toss;j++)
		{
			Random rand=new Random();
			System.out.println("Toss the Coin");
			int ctoss=rand.nextInt(2);
			if(ctoss==1)
				s[i]=s[i]+"H";
			else if(ctoss==0)
				s[i]=s[i]+"T";
			
			
		}
		
		
		int flag1=0;
		for(int k=0;k<toss;k++)
			
		{
			sh=heads.substring(k,toss);
			for(int m=0;m<=k;m++)
			{
				
				if(s[i].substring(k-m,toss-m).equals(sh))
				{
					flag1=1;
					break;
				}
				else
					flag1=0;
			}
			if(flag1==1)
			{   
				sum[toss-k]=sum[toss-k]+1;
				break;
			}
		}
		
		
		}
		System.out.println("The results after " +toss +" tosses are");
		for(int k2=1;k2<=t;k2++)
			System.out.println(s[k2]);
		for(int k1=0;k1<toss;k1++)
		{
			System.out.println("The run for "+k1+" heads occurs "+sum[k1]+" times.");
		}
	}
}

