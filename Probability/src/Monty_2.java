import java.util.Random;
import java.util.Scanner;
class Monty_2
{
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Simulations you want to perform");
		int t=sc.nextInt();
		int arr[]=new int[t+1];
		int sum=0;
		int sum2=0;
		int j;
		String door[]={"Door A","Door B","Door C"};
		for(int i=1;i<=t;i++)
		{	
		
		Random rand=new Random();
		System.out.println("Select a door out of the 3 doors");
		int prize=rand.nextInt(3);
		int rand2=rand.nextInt(2);
		int rand1=rand.nextInt(3);
		System.out.println("The Selected Door is"+door[rand1]);
		int ranarr0[]={1,2};
		int ranarr1[]={0,2};
		int ranarr2[]={0,1};
        if (rand1==0)	
        {
         System.out.println(door[ranarr0[rand2]] +" has a Goat ");
         System.out.println("Do You want to Switch??Yes/No ");
         int choice=rand.nextInt(2);
         
         if(choice==0)
        	 System.out.println("Yes");
         else if(choice==1)
        	 System.out.println("No");
         switch(choice)
         {
        	 case 0:
        		 for(j=0;j<3;j++)
        		 {
        			 if(rand1!=j&&ranarr0[rand2]!=j)
        			 {
        				 rand1=j;
        				 
        			 }
        		 }
        			 if(rand1==prize)
            		 {
            			 System.out.println("You Won");
            			 sum2++;
            			        			 
            		 }
            		 else
            		 {
            			 System.out.println("You Lost");
            			 
            		 }
        				 
        		 
        		 break;
        		 
        	 case 1:
        		 if(rand1==prize)
        		 {
        			 System.out.println("You Won");
        			 sum2++;
        			        			 
        		 }
        		 else
        		 {
        			 System.out.println("You Lost");
        			 
        		 }
        		 break;
        	 
        		 
         }
                  
        }
        
        else if (rand1==1)	
        {
         System.out.println(door[ranarr1[rand2]] +" has a Goat ");
         
         int choice=rand.nextInt(2);
         System.out.println("Do you want to switch your choice.Yes/No??");
         if(choice==0)
        	 System.out.println("Yes");
         else if(choice==1)
        	 System.out.println("No");
         switch(choice)
         {
        	 case 0:
        		 for(j=0;j<3;j++)
        		 {
        			 if(rand1!=j&&ranarr0[rand2]!=j)
        			 {
        				 rand1=j;
        				 
        			 }
        		 } 
        			 if(rand1==prize)
            		 {
            			 System.out.println("You Won");
            			 sum2++;
            			        			 
            		 }
            		 else
            		 {
            			 System.out.println("You Lost");
            			 
            		 }
        				 
        		 
        		 break;
        		 
        		 
        	 case 1:
        		 if(rand1==prize)
        		 {
        			 System.out.println("You Won");
        			 sum2++;
        			        			 
        		 }
        		 else
        		 {
        			 System.out.println("You Lost");
        			 
        		 }
        		 break;
        	 
        		 
         }
                
        }
        
        else if (rand1==2)	
        {
         System.out.println(door[ranarr2[rand2]] +" has a Goat ");
         
         int choice=rand.nextInt(2);
         System.out.println("Do you want to switch your choice.Yes/No??");
         if(choice==0)
        	 System.out.println("Yes");
         else if(choice==1)
        	 System.out.println("No");
         switch(choice)
         {
        	 case 0:
        		 for(j=0;j<3;j++)
        		 {
        			 if(rand1!=j&&ranarr2[rand2]!=j)
        			 {
        				 rand1=j;
        				 
        			 }
        		 }
        			 if(rand1==prize)
            		 {
            			 System.out.println("You Won");
            			 sum2++;
            			        			 
            		 }
            		 else
            		 {
            			 System.out.println("You Lost");
            			 
            		 }
        				 
        		 
        		 break;
        		 
        	 case 1:
        	  if(rand1==prize)
        		 {
        			 System.out.println("You Won");
        			 sum2++;
        			        			 
        		 }
        		 else
        		 {
        			 System.out.println("You Lost");
        			 
        		 }
        		 break;
        	 
        		 
         }
                   
        }
        
        double winpercent=(sum2*100)/i;
        System.out.println("The Current Win Percentage is"+winpercent+" Sum= "+sum2 +" Current i= "+i);
		}
		
	}

}
