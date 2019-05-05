
public class Driver {

	
	
	public static void printPerDigit(int x) {
		
		
	}
	
	public static void printOnce(int x) {
		int a, c, multiplier, y, b;
		y=0;
		multiplier = 1/10;
		c=0;
		a=0;
		b= x;
		if(x==0){a++;}
		while(x > 0) {
			x= x/10;
			a++;
			multiplier = multiplier *10;
		}
		while(a>0) {
			b=b%10;
			y = b * multiplier;
			c+= y;
			a--;
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x = 12345;
		
		printPerDigit(x);
		printOnce(x);
	}

}
