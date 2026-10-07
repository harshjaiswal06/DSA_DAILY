import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		
		int n2=sc.nextInt();
		
		int n3=sc.nextInt();
		
		int summing=0;
		
		
		
		for(int i=1;i<=n;i++){
		    
		    if((i*n2)==n3){
		        
		        summing=1;
		        
		        break;
		        
		    }
		        
		    
		}
		
		if(summing==1)System.out.println("YES");
		
		else System.out.println("NO");

	}
}
