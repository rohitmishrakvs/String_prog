import java.util.*;
class StringSplit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=0,flag=1;
		String [] word = s.split(" ");
		System.out.println(Arrays.toString(word));
		System.out.println("$$$$$$$$$$");
		for(int i=0;i<word.length;i++){
			count=0;
			for(int j=i+1;j<word.length;j++){
				count=0;
				if(word[i].equals(word[j])){
					count++	;
					if(count == 1){
						System.out.println(word[i]);
					}	 
				}
			}			
		}
	}
}