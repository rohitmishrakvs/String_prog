import java.util.*;
class HAckerEarth{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int count=0;
	int N = sc.nextInt();
	int M = sc.nextInt();
	int K = sc.nextInt();
	int [][]dd=new int[M][K]; 
	int []arr = new int[N];
	
	for(int i=0;i<N;i++){
		arr[i]=sc.nextInt();
	}
	
	/*for(int i=0;i<M;i++){
		for(int j=0;j<K;j++){
			dd[i][j]=0;
		}	
	}*/
		
	int l=0;
	for(int i=1;i<N;i++){
		l=arr[i];
		if(l<=M-1){
			for(int j= 0; j < K ; j++){
				if(dd[l][j] != 1){ 
					dd[l-1][j]=1;
					count++;
					break;
					}
				}
			}
		}
	System.out.println( "rest student is :"+(N-count));
	}
}