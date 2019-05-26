// if no date given, use current date
//if not year given, use 2011 as year

public class Date {
 private int day;
 private int month;
 private int year;	
 
 public Date() {
	 String month = "May ";
	 this.day = 26;
	 this.year = 2019;
	 String Date = month + " " + String.valueOf(day) + " " + String.valueOf(year);
 }
 
 public Date(int month, int day) {	
	 this.month = month;
	 this.day = day;
	 this.year = 2011;
	 
 }
 
 public Date(int month, int day, int year) {
	 this.month = month;
	 this.day = day;
	 this.year = year;
 }
 
 public boolean isValidDay() {
	 return true;
 }
 
 public void setYear(int year) {
	 this.year = year;
 }
 
 public int getYear(){
	 
	 return this.year;
 }
 
 public void setMonth(int month) {
	 this.month = month;
 }
 
 public int getMonth() {
	 return this.month;
 }
 
 public void setMonth(String month) {
	 
 }
 public void setDay(int day) {
	 this.day = day;
 }
 
 public int getDay() {
	 return this.day;
 }
}
