import java.util.*;
class StringPalin{
	static int count=0;
	public static void Ispalin(String str){
		
		int n = str.length();
		boolean flag = false;
		for(int i=0,j=n-1 ; i<n/2+1 ;i++,j--){
			if(str.charAt(i)==str.charAt(j)){
				flag = true;
			}
			else if(str.charAt(i)!=str.charAt(j)){
				//System.out.println(i+" "+j);
				break;
			}
		}
		if(flag == true){
			count++;
			
		}
	} 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = "this is level of crazy and fun and 141 which is eye and cool rotator";
		String []arr = str.split(" ");
		boolean flag = true;
		for(int i=0;i<arr.length;i++){
			//System.out.println(arr[i]);
			Ispalin(arr[i]);
		}
		System.out.println(count);
	}
}