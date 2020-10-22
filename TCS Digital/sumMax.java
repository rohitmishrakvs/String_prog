import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class  sumMax
{
    public static void maxValue(int []arr){
        int max =0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max=arr[i+1];
            }
        }
        System.out.println("*****"+max);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		for(int i = 0;i<n;i++){
		     
		    int []arr = new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		    }
		    
		    maxValue(arr);
		}
	}
}