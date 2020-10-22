import java.util.Scanner;
import java.util.*;
public class hAcker1{

    public static void getSmallestAndLargest(String s, int k) {
        String currentString=s.substring(0,k);
		String smallest =currentString ;
        String largest = currentString;
		int n =(s.length()-k)+1;
		for(int i=0;i<n;i++){
		 currentString=s.substring(i,i+k);
			if(smallest.compareTo(currentString)>0){
				smallest=currentString;
			}
			
			if(largest.compareTo(currentString)<0){
				largest=currentString;
			}
		}
		System.out.println(smallest);
		System.out.println(largest);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        getSmallestAndLargest(s, k);
    }
}