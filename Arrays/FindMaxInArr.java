import java.util.*;
import java.lang.*;
import java.io.*;

class FindMaxInArr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
	
		for(int i=0;i<T;i++){
		    int N=sc.nextInt();
		    int []arr=new int[N];
		    
		    for(int j=0;j<N;j++){
		        arr[j]=sc.nextInt();
		        
		    }
		    
		    int max=arr[0];
		    for(int j=1;j<N;j++){
		        if(arr[j]>max){
		            max=arr[j];
		        }
		    }
		    
		    System.out.println(max);
		    }
		}
		
		

	}
