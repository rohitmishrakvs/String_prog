import java.util.*
class KnapSack{
	int weight;
	int value;
	double ratio;
	public Knapsack(int w ,int v ){
		weight = w ;
		value = v ;
		ratio = (double)(v/w);
	}
}
class FractionalKnapSack{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int no_of_items = sc.nextInt();
		ArrayList lst = new ArrayList(no_of_items);
		for(int i=0;i<no_of_items;i++){
			lst.add(new Knapsack(sc.nextInt(),sc.nextInt()));
		}
	}
		System.out.println(lst);
	
}