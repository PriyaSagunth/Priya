import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int a=s.nextInt();
		if((a%4==0 && a%100!=0)||(a%400==0)){
		System.out.println("you enter a Leap year");	
		}
		else{
			System.out.println("you enter a Non Leap Year");
		}
}
}
