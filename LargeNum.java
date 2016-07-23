import java.util.Scanner;
public class LargerNum {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 3 numbers : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if( a>b && a>c){
			System.out.println("The largest number is a : "+a);
		}
		else if(b>c){
			System.out.println("The largest number is b : "+b);
		}
		else{
			System.out.println("The largest number is c : "+c);
		} 
	}
}
