
public class Driver {

	public static boolean primeChecker(int a) {
		boolean x;
		x = true;
		if(a == 0 || a == 1) {
			x = false;		
		}
		
		else {
			for(int i = 2; i < a; i++) {
				if(a%i == 0) {
					x = false;
					break;
				}
				else {
					x = true;	
				}
			}
		}
		
		return x;
	}
	
	public static int getReverse(int b) {
		int x, y, z;
		String d,e,f, g;
		f = String.valueOf(b %10);
		 if(b > 100) {
			 x = b / 100;
		  	d = String.valueOf(x);
		 }
		 else {
			 d = "";
		 }
		 if(b > 10) {
			 
			 y = (b / 10) % 10;
		  	e = String.valueOf(y);
		 }
		 else {
			 e = "";
		 }
		 g = f +e +d;
		z = Integer.valueOf(g);
		return z;
	}
	
	public static void main(String[] args) {
		
		int num = 3;
		
		if(primeChecker(num)) {
		int reverse = getReverse(num);
		if(num != reverse) {
			
			if(primeChecker(reverse)) {
				System.out.println("EMIRP: " + reverse);
			}
			else {
				
				System.out.println("The Number You Enter Is NOT EMIRP Number");
			}
		}
		else {
			System.out.println("The Number You Enter Is NOT EMIRP Number");
		}
		}
		else {
			System.out.println("The Number You Enter Is NOT EMIRP Number");
		}
		
	}
}
