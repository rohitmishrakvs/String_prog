import java.util.*;
class ArrayStringChallenege{
	static void SmallestString(String str,String str1){
		int num=0
		//HasMap<Integer,Character> mp = new HashMap<Integer,Character>();
		for(int i=0;i<str.length();i++){
			if(find(str.charAt(i),str1)){
				num=i;
			}
		}
		
		
	}
	static boolean find(char st , String str1){
		for(int i =0;i<str1.length();i++){
			if(st==str1.charAt(i)){
				str1.charAt(i)='*';
				return true;
			}
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String m = "ahffaksfajeeubsne";
		String n = "jefaa";
		System.out.println(SmallestString(m,n);
	}
	
}