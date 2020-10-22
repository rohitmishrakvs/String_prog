import java.util.*;
class StringList {
	public static void main(String[] args){
		String s = "this is crazy and fun";
		String str[]=s.split(" ");
		ArrayList<String> lst  = new ArrayList<String>( );
		lst.add("is");
		lst.add("fun");
		for(int i = 0 ;i < str.length;i++){
			System.out.print(str[i]+",");
		}
		System.out.println(" ");
		
		System.out.println(lst);
		
		//*****************************************************
		
		for(int i = 0 ;i < lst.size();i++){
			System.out.print(lst.get(i));
		}
		System.out.println(" ");
		//*****************************************************
		 
		for(int i = 0 ;i < lst.size() ; i++){
			for(int j = 0 ; j < str.length ; j++){
				if(lst.get(i)!=str[j]){
					str[j]=str[j].toUpperCase().charAt(0)+str[j].substring(1);
				}else{
					j=j+1;
				}				 
			}
			
		}
		
		for(int i = 0 ;i < str.length;i++){
			System.out.print(str[i]+",");
		}
		
		
		
	}
}