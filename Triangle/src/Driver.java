
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a= 0;
		b = 2;
		c = 2;
		
		if(a>0 && b>0 && c>0) {
			if((a+b)>c || (b+c)>a || (a+c)>b) {
				if(a==b && b==c && a == c){
					System.out.print("Equilateral");
					if((c*c)==(a*a)+(b*b) || (c*c)+(a*a)==(b*b) || (a*a)==(b*b)+(c*c)) {
						System.out.print(", Right Triangle");
					}
					else {
						System.out.print(", not Right Triangle");
					}
				}
				else if((a==b && b==c) || (a==c && b==c)|| (a==b && a==c)) {
					System.out.println("Isoceles");
					if((c*c)==(a*a)+(b*b) || (c*c)+(a*a)==(b*b) || (a*a)==(b*b)+(c*c)) {
						System.out.print(", Right Triangle");
						
					}
					else {
						System.out.print(", not Right Triangle");
					}

					
				} else if(a!=b && b!=c && a != c) {
					System.out.print("Scalene");
					if((c*c)==(a*a)+(b*b) || (c*c)+(a*a)==(b*b) || (a*a)==(b*b)+(c*c)) {
						System.out.print(", Right Triangle");
						
					}
					else {
						System.out.print(", not Right Triangle");
					}

				}
			}else{
				System.out.println("Not Triangle");
			}
		}else{
			System.out.println("Not Triangle");
		}
	}

}
