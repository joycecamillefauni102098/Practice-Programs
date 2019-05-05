
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		x=900;
		
		 if(x>=900) {
			 System.out.print("CM");
			 x-=900;
			 } 
		 else if(x>=500 && x<900) {
			 System.out.print("D");
			 x-=500;
			 while(x>100) {System.out.print("C"); x-=100;}}
		 
		 if(x>=400 && x<500) {
			 System.out.print("CD");
			 x-=400;
			 } 
	     else if(x>=100 && x<500) {
	    	 
			 while(x>=100) {System.out.print("C"); x-=100;}}
		 
		 if(x>=90 && x<100) {
			 System.out.print("XC");
			 x-=90;
		 } 
		 else if(x>=50 && x<90) {
			 x-=50;
			 System.out.print("L");
			 while(x>50) {System.out.print("X"); x-=10;}}
		 
		 if(x>=40 && x<50) {
			 System.out.print("XL");
			 x-=40;
		 } 
		 else if(x>=10 && x<40) {
			 while(x>=10) {System.out.print("X"); x-=10;}}
		 if(x==9) {
			 System.out.print("IX");
			 x-=9;
		 } 
		 else if(x>=5 && x<9) {
			 System.out.print("V");
			 while(x>5) {System.out.print("I"); x-=1;}}
		 
		 if(x==4) {
			 System.out.print("IV");
		 } 
		 else if(x>=1 && x<4) {
			 while(x>=1) {System.out.print("I"); x-=1;}}
		
		
	
		
		
	}

}
