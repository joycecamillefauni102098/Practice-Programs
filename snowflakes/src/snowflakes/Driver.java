package snowflakes;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, j, a;
		x = 1;
		a = (x/2)+1;
		System.out.println(a);
		
		for(i = 1; i <= x; i++) {
			for(j= 1 ; j <=x; j++) {
				int y;
				y = i+j;
				
				if(i==j || j ==a || i ==a || y == x+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}

	}

}
