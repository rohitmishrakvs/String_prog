import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int arr[] = new int[]{0,1,0,1,0,1,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,1,0,1,0,0};
	   int k=0;
	   int temp=0;
	   int i=0;
	   //for(int i=k;k<arr.length-2;i++)
	   while(i<arr.length-1){
		   if(arr[i+1]==0){
				k++;
				if(k<arr.length-1 && arr[i+2]==0){
					k++;	
					temp++	;				
				}
				else{
				temp++;}
			}
			else{
				if(arr[i+2]==0){
					k=k+2;
					temp++;
				}
			}
			i=k;
	   }System.out.println(temp);
    }
}