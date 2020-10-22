import java.util.*;

class  Prim{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++){
			int flag = 0;
			for(int j =2 ; j<i;j++){
				if(arr[i]%j==0){flag =1;break;}
			
				
			}
			if(flag==0){
				if(max < arr[i]){
					max=arr[i];
				}
			}
		} 
		System.out.println(max);
	}
	
}