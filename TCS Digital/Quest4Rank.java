import java.util.*;
class Quest4Rank{
	public static int[] Rank(int []arr1,int []arr2){
		int count = 1;
		int []rank = new int[arr2.length];
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(count);
		for(int i =0;i<arr1.length;i++){
			if(arr1[i]==arr1[i+1]){
				ls.add(count);
			}
			else{
				count++;
				ls.add(count);
			}
		}
		System.out.println(ls);
		
		for(int i =0;i<arr2.length;i++){
			for(int j =0;j<arr1.length;j++){
				if(arr2[i]>arr1[j]){
					rank[i]=ls.get(j);
					j=j+1;
					ls.add(ls.get(j)+1);
					while(j<ls.size()-1){
						if(ls.get(j)==ls.get(j+1)){}
						else{ls.add(ls.get(j)+1);}
					}
					break;
				}
				else if(arr2[i]==arr1[j]){
					rank[i]=ls.get(j); 
					ls.add(j,ls.get(j));
					break;
				}
			}
		}
		return rank;
		
		
		
		
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int nScores = sc.nextInt();
		int []scores=new int[nScores];
		
		
		System.out.println("Eneter scores:");
		for(int i =0 ;i<scores.length;i++){
			scores[i]=sc.nextInt();
		}
		//100 100 50 40 40 20 10
		
		int chPlayed = sc.nextInt();
		int []chscores=new int[chPlayed];
		
		
		System.out.println("Eneter chacha scores:");
		for(int i =0 ;i<chscores.length;i++){
			scores[i]=sc.nextInt();
		}	
		//5 25 50 120;;
		
		int []arr = Rank(scores,chscores);
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		// 6 4 2 1 
	}
}