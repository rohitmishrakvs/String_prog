import java.util.*; 
import java.io.*;

class Main {

  public static String MinWindowSubstring(String pqr) {
    // code goes here
	String[] strArr=pqr.split(" ");
    String str = strArr[0];
    String s = strArr[1];
    ArrayList<String> ls = new ArrayList<String>(1000);
    for(int i =4;i<=str.length();i++){
      for(int j =i+1,temp=0 ;j<=str.length();j++,temp++){
         ls.add(str.substring(temp,j));
      }
    } 
	for(int i =0 ;i<ls.size();i++){
		if(have(ls.get(i),s)){
			System.out.println(ls.get(i));
			break;
		}
	}
    return strArr[0];
  }
  static boolean have(String k,String s){
   // char []arr= k.toCharArray();
    //char []pq = s.toCharArray();
    boolean flag=true;
    ArrayList<Character> lst = new ArrayList(k.length());
    for(int i =0 ; i<k.length() ;i++){
      lst.add(k.charAt(i));
    }
    ArrayList<Character> lst1 = new ArrayList(s.length());
    for(int i =0 ; i<s.length() ;i++){
      lst.add(s.charAt(i));
    }
    for(int i=0; i<lst1.size();i++){
        for(int j=0;j<=lst.size();j++){
          if(lst1.get(i)==lst.get(j)){
            lst.remove(i);
            break;
        
            
          }
          else{flag=false;}
        }
    }
    return flag;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MinWindowSubstring(s.nextLine())); 
  }

}