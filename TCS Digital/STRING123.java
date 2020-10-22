import java.util.*;
class STRING123{
	static void merg(String []arr1,String []arr2){
		String []arr = new String[(arr1.length)+(arr2.length)];
		int count=0;
		for( int i =0;i<arr1.length;i++){
			arr[i]=arr1[i];
			count++;
		}
		 
		for(int j=0;j<arr2.length;j++){
			 
			arr[count]=arr2[j];
			count++;
		}
		
		for(int k=0;k<arr.length;k++){
			
		}
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String []arr1 = new String[3];
		String []arr2 = new String[3];
		for(int i=0;i<3;i++){
			arr1[i]=sc.nextLine();
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextLine();
		 
		merg(arr1,arr2);
		
	}
}