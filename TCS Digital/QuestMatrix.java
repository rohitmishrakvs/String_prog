import java.util.*;
class QuestMatrix{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int sum=0,sum1=0;
		int n = sc.nextInt();
		int [][]Matrix=new int[n][n];
		for(int i = 0;i<Matrix.length;i++){
			for(int j=0;j<Matrix.length;j++){
				Matrix[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<Matrix.length;i++){
			sum+=Matrix[i][i];
			sum1+=Matrix[i][n-1-i];
		}
		System.out.println(Math.abs(sum1-sum));
	}
}