import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner (System.in);
		
		int t=sc.nextInt();
		
		while(t-->0){
		    
		    int n=sc.nextInt();
		    
		    int m=sc.nextInt();
		    
		    String s=sc.next();
		    
		    String l=sc.next();
		    
		    int lop=0;
		    
		    ArrayList<String> ans=new ArrayList<>();
		    
		    for(int i=0;i<n;i++){
		        
		        for(int j=0;j<m;j++){
		            
		            if(s.charAt(i)==l.charAt(j)){
		                 
		                 ans.add("l");
		                 
		                 lop=1;
		                 
		                 break;
		                 
		            }
		            
		            
		        }
		        if(lop==0){
		            ans.add("r");
		        }
		        lop=0;
		        
		    }
		    
		    String p=ans.get(0);
		    
		    int curr=1;
		    
		    int max=0;
		    
		    
		    for(int i=1;i<ans.size();i++){
		        
		        if(p.equals(ans.get(i))){
		            
		            curr++;
		        }
		        
		        else{
		            max=Math.max(max,curr);
		            
		            curr=1;
		            
		            p=ans.get(i);
		        }
		        
		    }
		    
		    max=Math.max(max,curr);
		    
		    System.out.println(max);

		}
	}
}
