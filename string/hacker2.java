import java.util.Scanner;
class  hacker2{

    public static boolean isAnagram(String A, String B) {
        String a =A.toUpperCase();
		String b =B.toUpperCase();	
		boolean bq=false;
		int Num= a.length();
		int temp=1,count=1;
		if(a.length()!=b.length()){return bq;}
        for(int i=0;i<Num;i++){
			for(int j=0;j<Num;j++){
				if(a.charAt(i)==a.charAt(j)){
					count++;
				}
				if(a.charAt(i)==b.charAt(j)){
					temp++;
				}
			}
			if(count==temp){
				count=0;
				temp=0;
			}
			else{
				 
				 
				break;
			}
			
		}if(count==temp){bq=true;}
		return bq;
    }
	

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret=isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
