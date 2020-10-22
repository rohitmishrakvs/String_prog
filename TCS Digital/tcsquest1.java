import java.util.*;
class tcsquest1{
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//System.out.println("No of test cases");
		System.out.println("radius array");
		int []radius = new int[3];
		for(int i =0;i<radius.length;i++){
			radius[i]=sc.nextInt();
		}
		System.out.println("angular array");
		int []angular_v=new int[3];
		for(int i =0;i<angular_v.length;i++){
			angular_v[i]=sc.nextInt();
		}
		System.out.println("No of clicks");
		int time = sc.nextInt();
		int s=0;  // arc distance 
		boolean flag = true;
		for(int i =0;i<3;i++){
			s = angular_v[i]*time*radius[i];
			if(s%360 != 0){
				flag =false;
				break;
			}
		}
		if(flag==true){
			System.out.println("TRUE");
		}
		else{
			System.out.println("FALSE");
		}
	}
}