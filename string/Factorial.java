import java.util.*;
class Factorial{
	 
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		long newnum=1;
		int count=0;
		 for (int i = 5; n / i >= 1; i *= 5){ 
            count += n / i; 
			System.out.println(n/i);
		 }
		System.out.println(count);
		System.out.println("****************************");
		 
		
	/*	while(newnum%10==0){
			count++;
		}
		System.out.println(count);
		*/
	}
}