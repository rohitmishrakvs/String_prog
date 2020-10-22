import java.lang.*;
import java.util.*;
class Demo{
	int x,y;
}
class DemoA2 implements Cloneable{
	int a,b;
	Demo d = new Demo();
	public Object clone() throws CloneNotSupportedException{
		DemoA2 t=(DemoA2)super.clone();
		t.d = new Demo();
		return t;
	}
}
class DeepCopy{
	public static void main(String[] args)throws CloneNotSupportedException{
		DemoA2 d1 =new DemoA2();
		d1.a=20;
		d1.b=30;
		d1.d.x=40;
		d1.d.y=50;
		
		DemoA2 d2 = (DemoA2)d1.clone();
		d2.a=30;
		 
		d2.d.x=90;
		 
		
		System.out.println("a ="+d1.a+" b="+d1.b+" x="+d1.d.x+" y="+d1.d.y);
		System.out.println("a ="+d2.a+" b="+d2.b+" x="+d2.d.x+" y="+d2.d.y);
	}
}