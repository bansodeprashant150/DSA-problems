import java.util.*;
import java.lang.*;
import java.io.*;

class SearchInArr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		sc.nextLine();
		
		int[] arr=new int[N];
		
		
		for(int i=0;i<N;i++){
		    arr[i]=sc.nextInt();
		}
		
		boolean found=false;
		for(int i=0;i<N;i++){
        if(arr[i]==X){
            found=true;
            break;
        }
	}
	
	if(found){
	    System.out.println("Yes");
	}
	else{System.out.println("No");
}
}}
