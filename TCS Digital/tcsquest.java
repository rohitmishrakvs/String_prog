import java.util.*;
class tcsquest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		 int N_incoming=sc.nextInt();
		 int []arr=new int[N_incoming];
		 int M_outgoing=sc.nextInt();
		 int []arr1=new int[M_outgoing];
		 int rust = sc.nextInt();
		 for(int i=0;i<arr.length;i++){
			 arr[i]=sc.nextInt();
		 }
		 for(int i =0;i<arr1.length;i++){
			 arr1[i]=sc.nextInt();
		 }
		 int sum1=0;
		 int sum2=0;
		 for(int i=0;i<arr.length;i++){
			 sum1+=arr[i];
		 }
		 for(int i=0;i<arr1.length;i++){
			 sum2+=arr1[i];
		 }
		 int pipe_cp=0;
		 int Actual_cap_of_incoming = sum1 - N_incoming*rust;
		 int Actual_cpacity_outgoing = sum2 - M_outgoing*rust;
		 if(Actual_cap_of_incoming == Actual_cpacity_outgoing){
			 System.out.println("BALANCED");
		 }
		 if(Actual_cap_of_incoming > Actual_cpacity_outgoing){
			  pipe_cp=  Actual_cpacity_outgoing -Actual_cap_of_incoming-rust;
			 System.out.println(pipe_cp);
		 }
		 else if(Actual_cpacity_outgoing > Actual_cap_of_incoming ){
			 pipe_cp=Actual_cpacity_outgoing - Actual_cap_of_incoming + rust;
			 System.out.println(pipe_cp);
		 } 
	}
} 
