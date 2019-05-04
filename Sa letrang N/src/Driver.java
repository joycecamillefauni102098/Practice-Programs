
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, i, j;
		x=6;
		for(i = 0 ; i < x; i++ ){
		for(j =0 ; j<x; j++) {
			if(i == j || j == 0 || j ==x-1) {
			System.out.print("*");
		} else {
			System.out.print(" ");
		}
			}
		System.out.println();
		
		}
	}
	
}
