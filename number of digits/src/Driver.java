
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,  a;
		a=0;
		x=-1000000000;
		x= Math.abs(x);
		if(x==0) {a++;}
		while(x > 0) {
			x= x/10;
			a++;
		}
		System.out.println(a);
		
		
		
	}

}
