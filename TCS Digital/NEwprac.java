import java.util.*;
class NEwprac{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int []arr=new int[n];
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("***"+arr[0]);
		for(int i=1;i<arr.length;i++){
			while(arr[i]!=arr[0]){
				arr[i]--;
				count++;
			}
			System.out.println(count);
		}
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		while(arr[0]!=0){
				arr[0]--;
				count++;
			
		}
		System.out.println(count);
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}