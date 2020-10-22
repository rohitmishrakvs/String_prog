import java.util.*;
class Quest3Haboo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pageNo=sc.nextInt();
		
		int count =0;
		if(pageNo==1){
			System.out.println(0);
		}
		else if(pageNo==n){
			System.out.println(n/2);
		}
		else{
			System.out.println(pageNo/2);
		}		
	}
}