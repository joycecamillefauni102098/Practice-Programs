import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub      
		 String input1 = "I love Java";               
		 String input2 = "I love OBJECTP";
		 
		 //insert codes here
		 
		 //Item 1
		 System.out.println(input1);
		 //Item 2
		 System.out.println(input2);
		 //Item 3
		 String joinedStrings = input1 + " and " + input2;
		 System.out.println(joinedStrings);
		 //Item 4
		 System.out.println(input1.length());
		 //Item 5
		 System.out.println(input1.length()+input2.length());
		 //Item 6
		 System.out.println(input2.toUpperCase());
		 //Item 7
		 System.out.println(input2.toLowerCase());
		 //Item 8
		 System.out.println(input2.replace(" ", ""));
		 //Item 9
		 System.out.println(input1.substring(7));
		 //Item 10
		 System.out.println(input1.substring(0, 7));
		 //Item 11
		 System.out.println(input1.codePointAt(0));
		 //Item 12
		 if(input1.equals(input2)) {
			  System.out.println("equal");
		 }
		 else {
			 System.out.println("not equal");
		 }
		 //Item 13
		 String lowerCase = input2.toLowerCase();
		 String replaced = lowerCase.replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U');
		 System.out.println(replaced);
		 //Item 14
		 String lowerCase1 = input1.toLowerCase();
		int b = 0;
	     for(int i = 0; i< input1.length(); i++) {
	    	 
		 if(lowerCase1.charAt(i) == 'a') {  
			 b++;
		 }
	     }
	     System.out.println(b);
		 //Item 15
	     int d= input1.compareToIgnoreCase(input2);
	     if(d> 0 ) {
	    	 System.out.println(input2);
	     }
	     else {
	    	 System.out.println(input1);
	     }
	}

}
